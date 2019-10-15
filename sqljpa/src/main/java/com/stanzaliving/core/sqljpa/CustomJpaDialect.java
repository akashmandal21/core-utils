package com.stanzaliving.core.sqljpa;

import java.sql.SQLException;

import javax.persistence.EntityManager;

import org.apache.log4j.Logger;
import org.springframework.orm.jpa.vendor.HibernateJpaDialect;
import org.springframework.transaction.TransactionDefinition;

import com.stanzaliving.core.sqljpa.enums.DbType;

public class CustomJpaDialect extends HibernateJpaDialect {

	private static final long serialVersionUID = 643809217L;

	private static final Logger logger = Logger.getLogger(CustomJpaDialect.class);

	@Override
	public Object beginTransaction(EntityManager entityManager, TransactionDefinition definition) throws SQLException {
		if (definition.isReadOnly()) {
			DbContextHolder.setDbType(DbType.REPLICA);
		} else {
			DbContextHolder.setDbType(DbType.MASTER);
		}

		if (logger.isTraceEnabled()) {
			logger.trace(Thread.currentThread().getName() + ": DBType in JPA Dialect: " + DbContextHolder.getDbType());
		}

		return super.beginTransaction(entityManager, definition);
	}
}