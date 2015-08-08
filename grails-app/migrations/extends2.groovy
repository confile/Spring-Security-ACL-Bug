databaseChangeLog = {

	changeSet(author: "mg (generated)", id: "1437755767021-1") {
		createTable(tableName: "role") {
			column(autoIncrement: "true", name: "id", type: "bigint") {
				constraints(nullable: "false", primaryKey: "true", primaryKeyName: "rolePK")
			}

			column(name: "version", type: "bigint") {
				constraints(nullable: "false")
			}

			column(name: "authority", type: "varchar(255)") {
				constraints(nullable: "false")
			}
		}
	}

	changeSet(author: "mg (generated)", id: "1437755767021-2") {
		createTable(tableName: "user") {
			column(autoIncrement: "true", name: "id", type: "bigint") {
				constraints(nullable: "false", primaryKey: "true", primaryKeyName: "userPK")
			}

			column(name: "version", type: "bigint") {
				constraints(nullable: "false")
			}

			column(name: "account_expired", type: "bit") {
				constraints(nullable: "false")
			}

			column(name: "account_locked", type: "bit") {
				constraints(nullable: "false")
			}

			column(name: "enabled", type: "bit") {
				constraints(nullable: "false")
			}

			column(name: "password", type: "varchar(255)") {
				constraints(nullable: "false")
			}

			column(name: "password_expired", type: "bit") {
				constraints(nullable: "false")
			}

			column(name: "username", type: "varchar(255)") {
				constraints(nullable: "false")
			}
		}
	}

	changeSet(author: "mg (generated)", id: "1437755767021-3") {
		createTable(tableName: "user_role") {
			column(name: "user_id", type: "bigint") {
				constraints(nullable: "false")
			}

			column(name: "role_id", type: "bigint") {
				constraints(nullable: "false")
			}
		}
	}

	changeSet(author: "mg (generated)", id: "1437755767021-4") {
		addPrimaryKey(columnNames: "user_id, role_id", constraintName: "user_rolePK", tableName: "user_role")
	}

	changeSet(author: "mg (generated)", id: "1437755767021-7") {
		createIndex(indexName: "authority_uniq_1437755766792", tableName: "role", unique: "true") {
			column(name: "authority")
		}
	}

	changeSet(author: "mg (generated)", id: "1437755767021-8") {
		createIndex(indexName: "username_uniq_1437755766794", tableName: "user", unique: "true") {
			column(name: "username")
		}
	}

	changeSet(author: "mg (generated)", id: "1437755767021-9") {
		createIndex(indexName: "FK143BF46A8F889F6", tableName: "user_role") {
			column(name: "role_id")
		}
	}

	changeSet(author: "mg (generated)", id: "1437755767021-10") {
		createIndex(indexName: "FK143BF46AAE234DD6", tableName: "user_role") {
			column(name: "user_id")
		}
	}

	changeSet(author: "mg (generated)", id: "1437755767021-5") {
		addForeignKeyConstraint(baseColumnNames: "role_id", baseTableName: "user_role", constraintName: "FK143BF46A8F889F6", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "role", referencesUniqueColumn: "false")
	}

	changeSet(author: "mg (generated)", id: "1437755767021-6") {
		addForeignKeyConstraint(baseColumnNames: "user_id", baseTableName: "user_role", constraintName: "FK143BF46AAE234DD6", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "user", referencesUniqueColumn: "false")
	}
}
