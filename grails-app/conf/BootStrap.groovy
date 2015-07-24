import test.Role
import test.User
import test.UserRole

class BootStrap {

  def init = { servletContext ->
    
    def userRole = Role.findOrSaveWhere(authority: "ROLE_USER")
    def adminRole = Role.findOrSaveWhere(authority: "ROLE_ADMIN")

    if(!User.findByUsername("admin")) {
      def adminUser = new User(
          username:"admin",
          password:"admin",
          enabled:true,
          passwordExpired:false).save(flush:true)
      assert adminUser
      UserRole.create adminUser, adminRole
      UserRole.create adminUser, userRole
    }
    
    if(!User.findByUsername("user")) {
      def normalUser = new User(
          username:"user",
          password:"user",
          enabled:true,
          passwordExpired:false).save(flush:true)
      assert normalUser
      UserRole.create normalUser, userRole
    }
    
  }

  def destroy = {
  }
}
