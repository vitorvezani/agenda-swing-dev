package com.window.test.config;

import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
public class DbAppConfig {

//	@Autowired
//	LocalSessionFactoryBean factory; // http://stackoverflow.com/questions/15438835/i-am-at-a-loss-moving-from-spring-xml-to-java-config

	@Bean
	@Autowired
	public DataSource getDataSource(DatabaseConfiguration config) {
		BasicDataSource datasource = new BasicDataSource();
		datasource.setDriverClassName(config.getDriverClass());
		datasource.setUrl(config.getUrl());
		datasource.setUsername(config.getUsername());
		datasource.setPassword(config.getPassword());
		return datasource;
	}

//	@Bean
//	@Autowired
//	public LocalSessionFactoryBean getSessionFactoryBean(DataSource datasource, HibernateProperties properties) {
//		LocalSessionFactoryBean factory = new LocalSessionFactoryBean();
//		factory.setDataSource(datasource);
//		factory.setHibernateProperties(properties);
//		factory.setPackagesToScan(new String[] { "com.window.test" });
//		return factory;
//	}
//
//	/**
//	 * Since the LocalSessionFactoryBean is available on the context, the
//	 * LocalSessionFactoryBean.getObject will supply the session factory by the
//	 * auto detection of spring.
//	 *
//	 * @param factory
//	 * @return
//	 */
//	@Bean
//	@Autowired
//	public HibernateTransactionManager getTransactionManager(SessionFactory factory) {
//		return new HibernateTransactionManager(factory);
//	}
//
//	/**
//	 * inclusion The PropertySourcesPlaceholderConfigurer automatically lets the
//	 * annotation included property files to be scanned. setting it static to
//	 * spawn on startup.
//	 * 
//	 * @return
//	 */
//	@Bean
//	public static PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer() {
//		PropertySourcesPlaceholderConfigurer ph = new PropertySourcesPlaceholderConfigurer();
//		ph.setIgnoreUnresolvablePlaceholders(true);
//		return ph;
//	}
	
}
