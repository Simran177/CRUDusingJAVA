/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.capp.command;

import com.mycompany.capp.domain.User;

/**
 *
 * @author Unnati Goyal
 */
public class UserCommand {
    User user;
    //TODO: more fields if required(like terms & conditions checkbox)

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
    
    
}
