/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.capp.service;

import com.mycompany.capp.domain.Contact;
import java.util.List;

/**
 *The interface specifies all business operation for Contact Entity
 * @author Unnati Goyal
 */
public interface ContactService {
    public void save(Contact c);
    public void update(Contact c);
    public void delete(Integer contactId); //single contact delete
    public void delete(Integer[] contactIds); //multiple contact delete
    /**
     * This method returns all user contact (user who is logged in).
     * @param userId
     * @return 
     */
    public List<Contact> findUserContact(Integer userId); //person that is logged in can see only their personal phone book contact
    /**
     * The method search contact for user(userId) based on given free-text criteria
     * @param userId User who is logged in
     * @param txt Text criteria used to search
     * @return 
     */
    public List<Contact> findUserContact(Integer userId, String txt);

}
