/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.capp.exception;

/**
 *
 * @author Unnati Goyal
 */
public class UserBlockedException extends Exception{
    /**
     * Creates User object without error description
     */
    public UserBlockedException(){
    }
    
    /**
     * Creates User object with error description that will be supplied to parent class
     */
    public UserBlockedException(String errDesc){
        super(errDesc);
    }
}
