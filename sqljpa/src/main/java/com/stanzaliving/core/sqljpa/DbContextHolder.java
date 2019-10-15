package com.stanzaliving.core.sqljpa;

import org.apache.log4j.Logger;
import org.springframework.core.NamedThreadLocal;

import com.stanzaliving.core.sqljpa.enums.DbType;

import lombok.experimental.UtilityClass;

@UtilityClass
public class DbContextHolder {

	private static final Logger logger = Logger.getLogger(DbContextHolder.class);

	private static final ThreadLocal<DbType> contextHolder = new NamedThreadLocal<>("db type context");

	public static void setDbType(DbType dbType) {
		if (dbType == null) {
			throw new NullPointerException();
		}

		contextHolder.set(dbType);

		if (logger.isTraceEnabled()) {
			logger.trace(Thread.currentThread().getName() + ": DBType in Context Holder: " + dbType);
		}
	}

	public static DbType getDbType() {
		if (logger.isTraceEnabled()) {
			logger.trace("current db type: " + contextHolder.get());
		}
		return contextHolder.get();
	}

	public static void clearDbType() {
		contextHolder.remove();
	}

}