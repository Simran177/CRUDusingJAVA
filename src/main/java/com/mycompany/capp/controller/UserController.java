/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.capp.controller;
import com.mycompany.capp.command.LoginCommand;
import com.mycompany.capp.domain.User;
import com.mycompany.capp.exception.UserBlockedException;
import com.mycompany.capp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMethod;
/**
 *
 * @author Simran
 */
@Controller
public class UserController {
    @Autowired
    private UserService userService;
    @RequestMapping(value={"/","/index"})  //default page
    public String index(Model m){
        m.addAttribute("command",new LoginCommand());
        return "index";  //JSP page resolved by -WEB-INF/view/index.jsp
    }
    
    @RequestMapping(value="/login", method= RequestMethod.POST) 
    
//    dispatcher servlet is working at the front who will receive request and read data from parameters and bind both parameters
            
    public String handleLogin(@ModelAttribute("command") LoginCommand cmd,Model m){
        try{
       User loggedInUser= userService.login(cmd.getLoginName(),cmd.getPassword());
       if(loggedInUser==null){
//           user supplied wrong details
            m.addAttribute("err","Login Failed! Enter valid credentials.");
            return "index";
       }
            else{
//                  Success
//                    check the role and redirect to a apt dashboard 
                    if(loggedInUser.getRole().equals(UserService.ROLE_ADMIN)){
                        return "redirect:admin/dashboard";
                    }
                    else if(loggedInUser.getRole().equals(UserService.ROLE_USER)){
                        return "redirect:user/dashboard";
                    }
                    else{
                    //add error message and go back to login form
                    m.addAttribute("err","Invalid User ROLE");
                    return "index";
                    }
                 }
       }
        
        catch(UserBlockedException ex){
            //error message if user account is blocked and go back to login-form
            m.addAttribute("err",ex.getMessage());
            return "index"; 
        }
    }
    
    @RequestMapping(value="/user/dashboard")
    public String userDashboard(){
//        this page will be displayed when user is logged in
        return "dashboard_user";  //JSP - WEB-INF/view/index.jsp
    }
    
    @RequestMapping(value="/admin/dashboard")
    public String adminDashboard(){
        return "dashboard_admin";  //JSP - WEB-INF/view/index.jsp
    }
}
