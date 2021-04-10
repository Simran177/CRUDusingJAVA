package com.mycompany.capp.config;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author user
 */
@Configuration
//Spring will identify DAOs from this location
@ComponentScan(basePackages={"com.mycompany.capp.dao","com.mycompany.capp.service"})
public class SpringRootConfig {
    // TODO : Services, DAO, DataSource, Email Sender or some other business
   @Bean
    public BasicDataSource getDataSource(){
    
        BasicDataSource ds= new BasicDataSource();
        ds.setDriverClassName("com.mysql.jdbc.Driver");
        ds.setUrl("jdbc:mysql://localhost:3306/capp_db");
        ds.setUsername("root");
        ds.setPassword("");
        ds.setMaxTotal(2);
        ds.setInitialSize(1);
        ds.setTestOnBorrow(true);
        ds.setValidationQuery("Select 1"); //connection checking
        ds.setDefaultAutoCommit(true);
        return ds;
    }
}
