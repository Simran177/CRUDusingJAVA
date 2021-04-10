
package com.mycompany.capp.config;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

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
        
    }
}
    

