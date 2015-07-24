dataSource {
  pooled = true
  jmxExport = true
  //    driverClassName = "org.h2.Driver"
  driverClassName = "com.mysql.jdbc.Driver"
  username = "sa"
  password = ""
}
hibernate {
  cache.use_second_level_cache = true
  cache.use_query_cache = false
//  cache.region.factory_class = 'net.sf.ehcache.hibernate.EhCacheRegionFactory' // Hibernate 3
  //old    cache.region.factory_class = 'org.hibernate.cache.ehcache.EhCacheRegionFactory' // Hibernate 4

  cache.region.factory_class = 'org.hibernate.cache.SingletonEhCacheRegionFactory' // Hibernate 3
  // cache.region.factory_class = 'org.hibernate.cache.ehcache.SingletonEhCacheRegionFactory' // Hibernate 4

  singleSession = true // configure OSIV singleSession mode
  flush.mode = 'manual' // OSIV session flush mode outside of transactional context
}

// environment specific settings
environments {
  development {
    dataSource {
      //      dbCreate = "update" // muss weg bei db-migration
      url = "jdbc:mysql://localhost/test?useUnicode=yes&characterEncoding=UTF-8&zeroDateTimeBehavior=convertToNull"
      username = "root"
      password = ""
//      dialect = org.hibernate.dialect.MySQL5InnoDBDialect
      
//      dialect = org.hibernate.spatial.dialect.mysql.MySQLSpatial5InnoDBDialect  // use with hibernate-spatial 4.x
//      dialect = org.hibernatespatial.mysql.MySQLSpatialInnoDBDialect
      dialect = org.hibernatespatial.mysql.MySQLSpatialDialect
      pooled = true
      properties {
        maxActive = -1
        minEvictableIdleTimeMillis=1800000
        timeBetweenEvictionRunsMillis=1800000
        numTestsPerEvictionRun=3
        testOnBorrow=true
        testWhileIdle=true
        testOnReturn=true
        validationQuery = "select 1"
      }
    }
  }
  test {
    dataSource {
      dbCreate = "update"
      url = "jdbc:h2:mem:testDb;MVCC=TRUE;LOCK_TIMEOUT=10000;DB_CLOSE_ON_EXIT=FALSE"
    }
  }
 
}

/* Added by the Hibernate Spatial Plugin. */
//dataSource {
//   dialect = org.hibernatespatial.mysql.MySQLSpatialDialect
//  dialect = org.hibernatespatial.mysql.MySQLSpatial5InnoDBDialect
//}
