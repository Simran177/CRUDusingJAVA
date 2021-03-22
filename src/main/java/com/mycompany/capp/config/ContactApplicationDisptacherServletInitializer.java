/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.capp.config;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 *
 * @author Simran
 */
public class ContactApplicationDisptacherServletInitializer extends AbstractAnnotationConfigDispatcherServletInitializer{

    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[]{SpringRootConfig.class};   
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{SpringWebConfig.class};   
    }

    @Override
    protected String[] getServletMappings() {
       //mapping for dispatcher servlet, it receives specific pattern of url so tell url here
       return new String[]{"/"};
    }
    
    @Override
    public void onStartup(ServletContext servletContext) throws ServletException{
        super.onStartup(servletContext);  //must be present
        //Configure globaltask here if required
    }
}
    

