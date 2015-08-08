package test

import java.security.MessageDigest

class Company {

  String id
  String name
  
    static constraints = {
      id maxSize: 18, unique: true
    }
    
    
    static mapping = {
      id generator:'assigned'
    }
    
    def setIdIfMissing() {
      if (!id) {
        String uuid = UUID.randomUUID().toString()
        MessageDigest sha1 = MessageDigest.getInstance("SHA1")
        byte[] digest  = sha1.digest(uuid.getBytes())
        def tmpId = new  BigInteger(1, digest).toString(16)
        id = tmpId[0..17] // size of the id
      }
    }
      
    
    /**
     * Constructor
     */
    Company() {
      setIdIfMissing()
    }
    
    
}
