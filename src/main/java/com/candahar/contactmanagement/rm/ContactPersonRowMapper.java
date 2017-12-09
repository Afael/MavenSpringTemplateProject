/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.candahar.contactmanagement.rm;

import com.candahar.contactmanagement.domain.ContactPerson;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

/**
 *
 * @author User
 */
public class ContactPersonRowMapper implements RowMapper<ContactPerson>{

    @Override
    public ContactPerson mapRow(ResultSet rs, int rowNum) throws SQLException {
        ContactPerson contactPerson = new ContactPerson();
        contactPerson.setContactPersonId(rs.getInt("ContactPersonId"));
        contactPerson.setContactPersonName(rs.getString("ContactPersonName"));
        contactPerson.setContactPersonPhone(rs.getString("ContactPersonPhone"));
        contactPerson.setContactPersonEmail(rs.getString("ContactPersonEmail"));
        contactPerson.setContactPersonAddress(rs.getString("ContactPersonAddress"));
        contactPerson.setContactPersonLoginName(rs.getString("ContactPersonLoginName"));
        contactPerson.setContactPersonRole(rs.getInt("ContactPersonRole"));
        contactPerson.setContactPersonLoginStatus(rs.getInt("ContactPersonLoginStatus"));
        return contactPerson;
    }   
    
}
