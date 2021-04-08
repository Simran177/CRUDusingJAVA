/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.capp.rm;

import com.mycompany.capp.domain.Contact;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

/**
 *
 * @author Unnati Goyal
 */
public class ContactRowMapper implements RowMapper<Contact>{
    //RowMapper Object maps a record from ResultSet to Domain Object
    //i.e. 1 record from Contact table ---> 1 Domain Object
    @Override
    public Contact mapRow(ResultSet rs, int i) throws SQLException {
        //create domain object and bind values from rs 
        Contact c = new Contact();
        c.setContactId(rs.getInt("contactId"));
        c.setUserId(rs.getInt("userId"));
        c.setName(rs.getString("name"));
        c.setEmail(rs.getString("email"));
        c.setAddress(rs.getString("address"));
        c.setPhone(rs.getString("phone"));
        c.setRemark(rs.getString("remark"));
        return c;
    }
    
}
