databaseChangeLog = {

	changeSet(author: "mg (generated)", id: "1437755403731-1") {
		createTable(tableName: "acl_class") {
			column(autoIncrement: "true", name: "id", type: "bigint") {
				constraints(nullable: "false", primaryKey: "true", primaryKeyName: "acl_classPK")
			}

			column(name: "class", type: "varchar(255)") {
				constraints(nullable: "false")
			}
		}
	}

	changeSet(author: "mg (generated)", id: "1437755403731-2") {
		createTable(tableName: "acl_entry") {
			column(autoIncrement: "true", name: "id", type: "bigint") {
				constraints(nullable: "false", primaryKey: "true", primaryKeyName: "acl_entryPK")
			}

			column(name: "ace_order", type: "integer") {
				constraints(nullable: "false")
			}

			column(name: "acl_object_identity", type: "bigint") {
				constraints(nullable: "false")
			}

			column(name: "audit_failure", type: "bit") {
				constraints(nullable: "false")
			}

			column(name: "audit_success", type: "bit") {
				constraints(nullable: "false")
			}

			column(name: "granting", type: "bit") {
				constraints(nullable: "false")
			}

			column(name: "mask", type: "integer") {
				constraints(nullable: "false")
			}

			column(name: "sid", type: "bigint") {
				constraints(nullable: "false")
			}
		}
	}

	changeSet(author: "mg (generated)", id: "1437755403731-3") {
		createTable(tableName: "acl_object_identity") {
			column(autoIncrement: "true", name: "id", type: "bigint") {
				constraints(nullable: "false", primaryKey: "true", primaryKeyName: "acl_object_idPK")
			}

			column(name: "object_id_class", type: "bigint") {
				constraints(nullable: "false")
			}

			column(name: "entries_inheriting", type: "bit") {
				constraints(nullable: "false")
			}

			column(name: "object_id_identity", type: "bigint") {
				constraints(nullable: "false")
			}

			column(name: "owner_sid", type: "bigint")

			column(name: "parent_object", type: "bigint")
		}
	}

	changeSet(author: "mg (generated)", id: "1437755403731-4") {
		createTable(tableName: "acl_sid") {
			column(autoIncrement: "true", name: "id", type: "bigint") {
				constraints(nullable: "false", primaryKey: "true", primaryKeyName: "acl_sidPK")
			}

			column(name: "principal", type: "bit") {
				constraints(nullable: "false")
			}

			column(name: "sid", type: "varchar(255)") {
				constraints(nullable: "false")
			}
		}
	}

	changeSet(author: "mg (generated)", id: "1437755403731-5") {
		createTable(tableName: "async_mail_attachment") {
			column(autoIncrement: "true", name: "id", type: "bigint") {
				constraints(nullable: "false", primaryKey: "true", primaryKeyName: "async_mail_atPK")
			}

			column(name: "attachment_name", type: "varchar(255)") {
				constraints(nullable: "false")
			}

			column(name: "content", type: "longblob") {
				constraints(nullable: "false")
			}

			column(name: "inline", type: "bit") {
				constraints(nullable: "false")
			}

			column(name: "message_id", type: "bigint") {
				constraints(nullable: "false")
			}

			column(name: "mime_type", type: "varchar(255)") {
				constraints(nullable: "false")
			}

			column(name: "attachments_idx", type: "integer")
		}
	}

	changeSet(author: "mg (generated)", id: "1437755403731-6") {
		createTable(tableName: "async_mail_bcc") {
			column(name: "message_id", type: "bigint") {
				constraints(nullable: "false")
			}

			column(name: "bcc_string", type: "longtext")

			column(name: "bcc_idx", type: "integer")
		}
	}

	changeSet(author: "mg (generated)", id: "1437755403731-7") {
		createTable(tableName: "async_mail_cc") {
			column(name: "message_id", type: "bigint") {
				constraints(nullable: "false")
			}

			column(name: "cc_string", type: "longtext")

			column(name: "cc_idx", type: "integer")
		}
	}

	changeSet(author: "mg (generated)", id: "1437755403731-8") {
		createTable(tableName: "async_mail_header") {
			column(name: "message_id", type: "bigint") {
				constraints(nullable: "false")
			}

			column(name: "header_name", type: "varchar(255)")

			column(name: "header_value", type: "varchar(255)") {
				constraints(nullable: "false")
			}
		}
	}

	changeSet(author: "mg (generated)", id: "1437755403731-9") {
		createTable(tableName: "async_mail_mess") {
			column(autoIncrement: "true", name: "id", type: "bigint") {
				constraints(nullable: "false", primaryKey: "true", primaryKeyName: "async_mail_mePK")
			}

			column(name: "version", type: "bigint") {
				constraints(nullable: "false")
			}

			column(name: "attempt_interval", type: "bigint") {
				constraints(nullable: "false")
			}

			column(name: "attempts_count", type: "integer") {
				constraints(nullable: "false")
			}

			column(name: "begin_date", type: "datetime") {
				constraints(nullable: "false")
			}

			column(name: "create_date", type: "datetime") {
				constraints(nullable: "false")
			}

			column(name: "end_date", type: "datetime") {
				constraints(nullable: "false")
			}

			column(name: "envelope_from", type: "longtext")

			column(name: "from_column", type: "longtext")

			column(name: "html", type: "bit") {
				constraints(nullable: "false")
			}

			column(name: "last_attempt_date", type: "datetime")

			column(name: "mark_delete", type: "bit") {
				constraints(nullable: "false")
			}

			column(name: "max_attempts_count", type: "integer") {
				constraints(nullable: "false")
			}

			column(name: "priority", type: "integer") {
				constraints(nullable: "false")
			}

			column(name: "reply_to", type: "longtext")

			column(name: "sent_date", type: "datetime")

			column(name: "status", type: "varchar(255)") {
				constraints(nullable: "false")
			}

			column(name: "subject", type: "longtext") {
				constraints(nullable: "false")
			}

			column(name: "text", type: "longtext") {
				constraints(nullable: "false")
			}
		}
	}

	changeSet(author: "mg (generated)", id: "1437755403731-10") {
		createTable(tableName: "async_mail_to") {
			column(name: "message_id", type: "bigint") {
				constraints(nullable: "false")
			}

			column(name: "to_string", type: "longtext")

			column(name: "to_idx", type: "integer")
		}
	}

	changeSet(author: "mg (generated)", id: "1437755403731-11") {
		createTable(tableName: "company") {
			column(autoIncrement: "true", name: "id", type: "bigint") {
				constraints(nullable: "false", primaryKey: "true", primaryKeyName: "companyPK")
			}

			column(name: "version", type: "bigint") {
				constraints(nullable: "false")
			}
		}
	}

	changeSet(author: "mg (generated)", id: "1437755403731-18") {
		createIndex(indexName: "class_uniq_1437755403643", tableName: "acl_class", unique: "true") {
			column(name: "class")
		}
	}

	changeSet(author: "mg (generated)", id: "1437755403731-19") {
		createIndex(indexName: "FK5302D47D5B1B0850", tableName: "acl_entry") {
			column(name: "sid")
		}
	}

	changeSet(author: "mg (generated)", id: "1437755403731-20") {
		createIndex(indexName: "FK5302D47D8B9F71F2", tableName: "acl_entry") {
			column(name: "acl_object_identity")
		}
	}

	changeSet(author: "mg (generated)", id: "1437755403731-21") {
		createIndex(indexName: "unique_ace_order", tableName: "acl_entry", unique: "true") {
			column(name: "acl_object_identity")

			column(name: "ace_order")
		}
	}

	changeSet(author: "mg (generated)", id: "1437755403731-22") {
		createIndex(indexName: "FK2A2BB0095C2B98C4", tableName: "acl_object_identity") {
			column(name: "owner_sid")
		}
	}

	changeSet(author: "mg (generated)", id: "1437755403731-23") {
		createIndex(indexName: "FK2A2BB009699FB980", tableName: "acl_object_identity") {
			column(name: "object_id_class")
		}
	}

	changeSet(author: "mg (generated)", id: "1437755403731-24") {
		createIndex(indexName: "FK2A2BB0097FC8265D", tableName: "acl_object_identity") {
			column(name: "parent_object")
		}
	}

	changeSet(author: "mg (generated)", id: "1437755403731-25") {
		createIndex(indexName: "unique_object_id_identity", tableName: "acl_object_identity", unique: "true") {
			column(name: "object_id_class")

			column(name: "object_id_identity")
		}
	}

	changeSet(author: "mg (generated)", id: "1437755403731-26") {
		createIndex(indexName: "unique_principal", tableName: "acl_sid", unique: "true") {
			column(name: "sid")

			column(name: "principal")
		}
	}

	changeSet(author: "mg (generated)", id: "1437755403731-27") {
		createIndex(indexName: "FK1CACA0E817082B9", tableName: "async_mail_attachment") {
			column(name: "message_id")
		}
	}

	changeSet(author: "mg (generated)", id: "1437755403731-12") {
		addForeignKeyConstraint(baseColumnNames: "acl_object_identity", baseTableName: "acl_entry", constraintName: "FK5302D47D8B9F71F2", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "acl_object_identity", referencesUniqueColumn: "false")
	}

	changeSet(author: "mg (generated)", id: "1437755403731-13") {
		addForeignKeyConstraint(baseColumnNames: "sid", baseTableName: "acl_entry", constraintName: "FK5302D47D5B1B0850", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "acl_sid", referencesUniqueColumn: "false")
	}

	changeSet(author: "mg (generated)", id: "1437755403731-14") {
		addForeignKeyConstraint(baseColumnNames: "object_id_class", baseTableName: "acl_object_identity", constraintName: "FK2A2BB009699FB980", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "acl_class", referencesUniqueColumn: "false")
	}

	changeSet(author: "mg (generated)", id: "1437755403731-15") {
		addForeignKeyConstraint(baseColumnNames: "owner_sid", baseTableName: "acl_object_identity", constraintName: "FK2A2BB0095C2B98C4", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "acl_sid", referencesUniqueColumn: "false")
	}

	changeSet(author: "mg (generated)", id: "1437755403731-16") {
		addForeignKeyConstraint(baseColumnNames: "parent_object", baseTableName: "acl_object_identity", constraintName: "FK2A2BB0097FC8265D", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "acl_object_identity", referencesUniqueColumn: "false")
	}

	changeSet(author: "mg (generated)", id: "1437755403731-17") {
		addForeignKeyConstraint(baseColumnNames: "message_id", baseTableName: "async_mail_attachment", constraintName: "FK1CACA0E817082B9", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "async_mail_mess", referencesUniqueColumn: "false")
	}
}
