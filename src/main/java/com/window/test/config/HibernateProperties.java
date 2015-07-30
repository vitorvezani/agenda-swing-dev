//package com.window.test.config;
//
//import java.util.Properties;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Component;
//
//@Component
//public class HibernateProperties extends Properties
//{
//    /**
//	 * 
//	 */
//	private static final long serialVersionUID = 8232399445310765511L;
//
//	@Autowired
//    public HibernateProperties(HibernateConfiguration config)
//    {
//        setProperty("hibernate.dialect", config.getHibernateDialect());
//
//        setProperty("hibernate.id.new_generator_mappings", config.isUseNewIdGeneratorMappings() ? "true" : "false");
//
//        setProperty("hibernate.show_sql", config.isHibernateShowSQL() ? "true" : "false");
//    }
//}
