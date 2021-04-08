/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.capp.test;

import com.mycompany.capp.config.SpringRootConfig;
import javax.sql.DataSource;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;


public class TestDataSource {

    public static void main(String[] args) {
        // TODO code application logic here
        ApplicationContext ctx= new AnnotationConfigApplicationContext(SpringRootConfig.class);
        DataSource ds= ctx.getBean(DataSource.class);
    // BasicDataSource is implementation class from Apache library and DatSource is interface from javax.sql
       JdbcTemplate jt= new JdbcTemplate(ds);
       String sql= "INSERT into user(`name`,`phone`,`email`,`address`,`loginName`,`password`) VALUES (?,?,?,?,?,?)";
       Object[] param =new Object[]{"Simran","8953098700","simran221001@gmail.com","Varanasi","v","v123"};
       jt.update(sql,param);
       System.out.println("---SQL executed---");
    }

   
    
}
