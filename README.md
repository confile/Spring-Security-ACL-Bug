# Spring-Security-ACL-Bug
This project demonstrates a Bug in Spring-Security-ACL

Error 1:

Reproduce [this bug](http://stackoverflow.com/questions/31701823/unable-to-find-acl-information-for-object-identity-org-springframework-security) 

Note: The only this I changed in the ACL domains is in AclObjectIdentity objectId from Long to String.

- grails dbm-update
- grails run-app
- go to http://localhost:8080/test2/ login with user: admin PW: admin
- go to http://localhost:8080/test2/home/list
- go to http://localhost:8080/test2/home/createCompany1
- go to http://localhost:8080/test2/home/createCompany1
- stop server
- grails clean
- grails run-app
- go to http://localhost:8080/test2
- go to http://localhost:8080/test2/home/list

This should reproduce the error. 

Error 2: 

After ``grails s2-create-acl-domains`` Eclipse shows the following errors. 





