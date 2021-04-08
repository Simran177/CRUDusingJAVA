/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.capp.test;

import com.mycompany.capp.config.SpringRootConfig;
import com.mycompany.capp.dao.UserDAO;
import com.mycompany.capp.domain.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestUserDAOUpdate {
    public static void main(String[] args) {
       
        ApplicationContext ctx= new AnnotationConfigApplicationContext(SpringRootConfig.class);
        
        UserDAO userDAO = ctx.getBean(UserDAO.class);
        // the user details will be taken from Update user profile page
        User u= new User();
        u.setUserId(1);
        u.setName("Simran Maurya");
        u.setPhone("8953098700");
        u.setEmail("simran.maurya@gla.ac.in");
        u.setAddress("Varanasi, UP");
        u.setRole(1);  // 1 means admin
        u.setLoginStatus(1);  // 1 means active
       
   
        userDAO.update(u);
        System.out.println("====Data Updated====");
    }
    
}
