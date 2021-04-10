/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.capp.rm;

import com.mycompany.capp.domain.User;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

/**
 *
 * @author Unnati Goyal
 */
public class UserRowMapper implements RowMapper<User>{
    //RowMapper Object maps a record from ResultSet to Domain Object
    //i.e. 1 record from User table ---> 1 Domain Object
    @Override
    public User mapRow(ResultSet rs, int i) throws SQLException {
        //create domain object and bind values from rs 
        User u = new User();
        u.setUserId(rs.getInt("userId"));
        u.setName(rs.getString("name"));
        u.setPhone(rs.getString("phone"));
        u.setEmail(rs.getString("email"));
        u.setAddress(rs.getString("address"));
        u.setLoginName(rs.getString("loginName"));
        u.setRole(rs.getInt("role"));
        u.setLoginStatus(rs.getInt("loginStatus"));
        return u;
    }
    
}
