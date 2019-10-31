package com.stanzaliving.core.sqljpa;

import java.sql.SQLException;

import javax.persistence.EntityManager;

import org.springframework.orm.jpa.vendor.HibernateJpaDialect;
import org.springframework.transaction.TransactionDefinition;

import com.stanzaliving.core.sqljpa.enums.DbType;

public class CustomJpaDialect extends HibernateJpaDialect {

	private static final long serialVersionUID = 643809217L;

	@Override
	public Object beginTransaction(EntityManager entityManager, TransactionDefinition definition) throws SQLException {
		if (definition.isReadOnly()) {
			DbContextHolder.setDbType(DbType.REPLICA);
		} else {
			DbContextHolder.setDbType(DbType.MASTER);
		}

		return super.beginTransaction(entityManager, definition);
	}
}