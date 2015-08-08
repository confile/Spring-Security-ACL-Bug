# Spring-Security-ACL-Bug
This project demonstrates a Bug in Spring-Security-ACL

== Stepw to reproduce: 

- create a mysql database name: test
- grails dbm-update
- grails run-app
- http://localhost:8080/test2/home/list
- login with user: admin pw: admin
- http://localhost:8080/test2/home/createCompany1
- http://localhost:8080/test2/home/addPerm
- http://localhost:8080/test2/home/createCompany2
- http://localhost:8080/test2/home/list
- stop server
- grails clean
- grails run-app
- http://localhost:8080/test2/home/list


Error:  java.lang.String cannot be cast to java.lang.Long

```
2015-08-08 14:57:02,509 [http-nio-8080-exec-5] ERROR errors.GrailsExceptionResolver  - ClassCastException occurred when processing request: [GET] /test2/home/list
java.lang.String cannot be cast to java.lang.Long. Stacktrace follows:
Message: java.lang.String cannot be cast to java.lang.Long
    Line | Method
->>  305 | doCall                 in org.grails.datastore.gorm.GormStaticApi$_withCriteria_closure11
- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - 
|    302 | execute                in org.grails.datastore.mapping.core.DatastoreUtils
|     37 | execute . . . . . . .  in org.grails.datastore.gorm.AbstractDatastoreApi
|    304 | withCriteria           in org.grails.datastore.gorm.GormStaticApi
|    128 | lookupObjectIdentities in grails.plugin.springsecurity.acl.jdbc.GormAclLookupStrategy
|    106 | doCall                 in grails.plugin.springsecurity.acl.jdbc.GormAclLookupStrategy$_readAclsById_closure1
|     78 | readAclsById . . . . . in grails.plugin.springsecurity.acl.jdbc.GormAclLookupStrategy
|    288 | readAclsById           in grails.plugin.springsecurity.acl.AclService
|    127 | list . . . . . . . . . in test2.HomeController
|    198 | doFilter               in grails.plugin.cache.web.filter.PageFragmentCachingFilter
|     63 | doFilter . . . . . . . in grails.plugin.cache.web.filter.AbstractFilter
|     53 | doFilter               in grails.plugin.springsecurity.web.filter.GrailsAnonymousAuthenticationFilter
|     62 | doFilter . . . . . . . in grails.plugin.springsecurity.web.authentication.logout.MutableLogoutFilter
|   1142 | runWorker              in java.util.concurrent.ThreadPoolExecutor
|    617 | run . . . . . . . . .  in java.util.concurrent.ThreadPoolExecutor$Worker
^    745 | run                    in java.lang.Thread
Error |
2015-08-08 14:57:03,030 [http-nio-8080-exec-6] ERROR errors.GrailsExceptionResolver  - ClassCastException occurred when processing request: [GET] /test2/home/list
java.lang.String cannot be cast to java.lang.Long. Stacktrace follows:
Message: java.lang.String cannot be cast to java.lang.Long
    Line | Method
->>  305 | doCall                 in org.grails.datastore.gorm.GormStaticApi$_withCriteria_closure11
- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - 
|    302 | execute                in org.grails.datastore.mapping.core.DatastoreUtils
|     37 | execute . . . . . . .  in org.grails.datastore.gorm.AbstractDatastoreApi
|    304 | withCriteria           in org.grails.datastore.gorm.GormStaticApi
|    128 | lookupObjectIdentities in grails.plugin.springsecurity.acl.jdbc.GormAclLookupStrategy
|    106 | doCall                 in grails.plugin.springsecurity.acl.jdbc.GormAclLookupStrategy$_readAclsById_closure1
|     78 | readAclsById . . . . . in grails.plugin.springsecurity.acl.jdbc.GormAclLookupStrategy
|    288 | readAclsById           in grails.plugin.springsecurity.acl.AclService
|    127 | list . . . . . . . . . in test2.HomeController
|    198 | doFilter               in grails.plugin.cache.web.filter.PageFragmentCachingFilter
|     63 | doFilter . . . . . . . in grails.plugin.cache.web.filter.AbstractFilter
|     53 | doFilter               in grails.plugin.springsecurity.web.filter.GrailsAnonymousAuthenticationFilter
|     62 | doFilter . . . . . . . in grails.plugin.springsecurity.web.authentication.logout.MutableLogoutFilter
|   1142 | runWorker              in java.util.concurrent.ThreadPoolExecutor
|    617 | run . . . . . . . . .  in java.util.concurrent.ThreadPoolExecutor$Worker
^    745 | run                    in java.lang.Thread

```
