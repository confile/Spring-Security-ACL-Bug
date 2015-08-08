databaseChangeLog = {

	changeSet(author: "mg (generated)", id: "1437756361132-1") {
		addColumn(tableName: "company") {
			column(name: "name", type: "varchar(255)") {
				constraints(nullable: "false")
			}
		}
	}
}
