package test

import grails.plugin.springsecurity.acl.AclObjectIdentity
import grails.plugin.springsecurity.acl.AclService
import grails.plugin.springsecurity.acl.AclUtilService
import grails.transaction.Transactional

import org.springframework.security.access.prepost.PostFilter
import org.springframework.security.access.prepost.PreAuthorize
import org.springframework.security.acls.domain.AclImpl
import org.springframework.security.acls.domain.PrincipalSid
import org.springframework.security.acls.model.AccessControlEntry
import org.springframework.security.acls.model.Permission
import org.springframework.security.acls.model.Sid

@Transactional
class CompanyService {

  def aclPermissionFactory
  AclService aclService
  AclUtilService aclUtilService
  def springSecurityService
    


   @PreAuthorize("hasRole('ROLE_ADMIN')")
   @Transactional
   void addPermission(Company company, String username, Permission permission) {
     
     if (AclObjectIdentity.findByObjectId(company.id)) {
       AclImpl acl = aclUtilService.readAcl(company)
       Sid sidObject = new PrincipalSid(username)
     
       // check if the permission is still granted
       for (int i=0; i < acl.entries.size(); i++) {
         AccessControlEntry entry = acl.entries[i]
         if (entry.sid.equals(sidObject) && entry.permission.equals(permission)) {
           return
         }
       }
     }
     
//     if (AclClass.findByClassName(Company.class.name)) {
//       AclImpl acl = aclUtilService.readAcl(company)
//       Sid sidObject = new PrincipalSid(username)
//     
//       // check if the permission is still granted
//       for (int i=0; i < acl.entries.size(); i++) {
//         AccessControlEntry entry = acl.entries[i]
//         if (entry.sid.equals(sidObject) && entry.permission.equals(permission)) {
//           return
//         }
//       }
//     }     
     aclUtilService.addPermission(company, username, permission)
   }
    
   
   @Transactional
   @PreAuthorize("hasRole('ROLE_ADMIN') or hasPermission(#company, admin)")
   void deletePermission(Company company, String username, Permission permission) {
      AclImpl acl = aclUtilService.readAcl(company)
      Sid sidObject = new PrincipalSid(username)
      
      // Remove all permissions associated with this particular recipient (string equality to KISS)
      for (int i=0; i < acl.entries.size(); i++) {
        AccessControlEntry entry = acl.entries[i]
        if (entry.sid.equals(sidObject) && entry.permission.equals(permission)) {
          acl.deleteAce(i)
        }
      }
      aclService.updateAcl(acl)
      log.debug "Deleted company $company ACL permissions for recipient $username"
   }

   
//   @PreAuthorize("hasRole('ROLE_USER')")
   @PostFilter("hasPermission(filterObject, read) or hasPermission(filterObject, admin)")
   List<Company> list(Map params = [:]) {
     return Company.list(params)
   }
 
   
   @PreAuthorize("hasRole('ROLE_ADMIN')")
   void changeOwner(Company company, String username, Permission permission) {
     aclUtilService.changeOwner(company, username)
   }
   
   
    
}