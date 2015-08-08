databaseChangeLog = {

	changeSet(author: "mg (generated)", id: "1439037646953-1") {
		modifyDataType(columnName: "object_id_identity", newDataType: "varchar(255)", tableName: "acl_object_identity")
	}

	changeSet(author: "mg (generated)", id: "1439037646953-2") {
		modifyDataType(columnName: "id", newDataType: "varchar(18)", tableName: "company")
	}
}
