/**
 * 
 */
package com.stanzaliving.core.sqljpa;

import java.beans.PropertyVetoException;
import java.util.HashMap;
import java.util.Map;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import lombok.experimental.UtilityClass;
import lombok.extern.log4j.Log4j2;

/**
 * 
 * @author naveen
 *
 * @date 30-Sep-2019
 */
@UtilityClass
@Log4j2
public class JpaConfigUtil {

	public static void configureDbCrendentials(
			ComboPooledDataSource dataSource, String driverClassName, String dbUrl, String dbName, String dbPassword) throws PropertyVetoException {

		log.info("db credentials are {} {}",dbUrl,dbName);
		
		dataSource.setDriverClass(driverClassName);
		dataSource.setJdbcUrl(dbUrl);
		dataSource.setUser(dbName);
		dataSource.setPassword(dbPassword);
	}

	public static void configureDbPool(
			ComboPooledDataSource dataSource, int initialPoolSize, int minPoolSize, int maxPoolSize, int acquireIncrement) {

		dataSource.setInitialPoolSize(initialPoolSize);
		dataSource.setMinPoolSize(minPoolSize);
		dataSource.setMaxPoolSize(maxPoolSize);
		dataSource.setAcquireIncrement(acquireIncrement);
	}

	public static void configureDbConnection(
			ComboPooledDataSource dataSource,
			int maxStatements,
			int maxIdleTime,
			int maxIdleTimeExcessConnections,
			int checkoutTimeout,
			String preferredTestQuery,
			boolean testConnectionOnCheckin) {

		dataSource.setMaxStatements(maxStatements);
		dataSource.setMaxIdleTime(maxIdleTime);
		dataSource.setMaxIdleTimeExcessConnections(maxIdleTimeExcessConnections);
		dataSource.setCheckoutTimeout(checkoutTimeout);
		dataSource.setPreferredTestQuery(preferredTestQuery);
		dataSource.setTestConnectionOnCheckin(testConnectionOnCheckin);

	}

	public static Map<String, String> configureHibernateProperties(
			String hibernateCacheProviderClass,
			String hibernateDialect,
			String hibernateShowSql,
			String hibernateFormatSql,
			String hibernateHbm2ddlAuto,
			String hibernateOrderInserts,
			String hibernateOrderUpdates) {

		Map<String, String> properties = new HashMap<>();

		properties.put("hibernate.cache.provider_class", hibernateCacheProviderClass);
		properties.put("hibernate.dialect", hibernateDialect);
		properties.put("hibernate.show_sql", hibernateShowSql);
		properties.put("hibernate.format_sql", hibernateFormatSql);
		properties.put("hibernate.hbm2ddl.auto", hibernateHbm2ddlAuto);
		properties.put("hibernate.order_inserts", hibernateOrderInserts);
		properties.put("hibernate.order_updates", hibernateOrderUpdates);//PhysicalNamingStrategyStandardImpl
		//properties.put("org.hibernate.envers.audit_table_suffix", "_aud");
		properties.put("hibernate.implicit_naming_strategy", "org.springframework.boot.orm.jpa.hibernate.SpringImplicitNamingStrategy");
		properties.put("hibernate.physical_naming_strategy", "org.springframework.boot.orm.jpa.hibernate.SpringPhysicalNamingStrategy");

		return properties;
	}

	public static Map<String, String> configureHibernateProperties(
			String hibernateCacheProviderClass,
			String hibernateDialect,
			String hibernateShowSql,
			String hibernateFormatSql,
			String hibernateHbm2ddlAuto,
			String hibernateOrderInserts,
			String hibernateOrderUpdates,
			String hibernatePhysicalNamingStrategy) {

		Map<String, String> properties = JpaConfigUtil.configureHibernateProperties(hibernateCacheProviderClass, hibernateDialect, hibernateShowSql, hibernateFormatSql, hibernateHbm2ddlAuto, hibernateOrderInserts, hibernateOrderUpdates);
		properties.put("hibernate.physical_naming_strategy", hibernatePhysicalNamingStrategy);
		return properties;
	}
}