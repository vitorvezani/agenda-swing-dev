//package com.window.test.config;
//
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.context.annotation.PropertySource;
//import org.springframework.stereotype.Component;
//
//@Component
//@PropertySource(value = { "classpath:hibernate.properties" })
//public class HibernateConfiguration {
//	@Value("${hibernate.dialect}")
//	private String hibernateDialect;
//
//	@Value("${hibernate.id.new_generator_mappings}")
//	private boolean useNewIdGeneratorMappings;
//
//	@Value("${hibernate.show_sql}")
//	private boolean hibernateShowSQL;
//
//	public String getHibernateDialect() {
//		return hibernateDialect;
//	}
//
//	public void setHibernateDialect(String hibernateDialect) {
//		this.hibernateDialect = hibernateDialect;
//	}
//
//	public boolean isUseNewIdGeneratorMappings() {
//		return useNewIdGeneratorMappings;
//	}
//
//	public void setUseNewIdGeneratorMappings(boolean useNewIdGeneratorMappings) {
//		this.useNewIdGeneratorMappings = useNewIdGeneratorMappings;
//	}
//
//	public boolean isHibernateShowSQL() {
//		return hibernateShowSQL;
//	}
//
//	public void setHibernateShowSQL(boolean hibernateShowSQL) {
//		this.hibernateShowSQL = hibernateShowSQL;
//	}
//
//}