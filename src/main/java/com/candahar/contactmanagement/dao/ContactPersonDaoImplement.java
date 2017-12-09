/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.candahar.contactmanagement.dao;

import com.candahar.contactmanagement.domain.ContactPerson;
import com.candahar.contactmanagement.rm.ContactPersonRowMapper;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Jajang Jayus
 */
@Repository
public class ContactPersonDaoImplement extends BaseDao implements ContactPersonDao{

    @Override
    public void save(ContactPerson contactPerson) {
        String sql = "INSERT INTO ContactManagement.contactperson (ContactPersonName,\n" +
                        "  ContactPersonPhone, ContactPersonEmail, ContactPersonAddress,\n" +
                        "  ContactPersonLoginName, ContactPersonPassword, ContactPersonRole, ContactPersonLoginStatus) "+
                        "  VALUES (:ContactPersonName, :ContactPersonPhone, "+
                        "  :ContactPersonEmail, :ContactPersonAddress, "+
                        "  :ContactPersonLoginName, :ContactPersonPassword, :ContactPersonRole, :ContactPersonLoginStatus)";
        Map map = new HashMap();
        map.put("ContactPersonName", contactPerson.getContactPersonName());
        map.put("ContactPersonPhone", contactPerson.getContactPersonPhone());
        map.put("ContactPersonEmail", contactPerson.getContactPersonEmail());
        map.put("ContactPersonAddress", contactPerson.getContactPersonAddress());
        map.put("ContactPersonLoginName", contactPerson.getContactPersonLoginName());
        map.put("ContactPersonPassword", contactPerson.getContactPersonPassword());
        map.put("ContactPersonRole", contactPerson.getContactPersonRole());
        map.put("ContactPersonLoginStatus", contactPerson.getContactPersonLoginStatus());

        KeyHolder keyHolder = new GeneratedKeyHolder();
        SqlParameterSource sqlParameterSource = new MapSqlParameterSource(map);
        super.getNamedParameterJdbcTemplate().update(sql, sqlParameterSource, keyHolder);
        int contactPersonId = keyHolder.getKey().intValue();
        contactPerson.setContactPersonId(contactPersonId);
    }

    @Override
    public void update(ContactPerson contactPerson) {
        String sql = "UPDATE\n" +
                "  ContactManagement.contactperson\n" +
                "SET\n" +
                "  ContactPersonName = :ContactPersonName,\n" +
                "  ContactPersonPhone = :ContactPersonPhone,\n" +
                "  ContactPersonEmail = :ContactPersonEmail,\n" +
                "  ContactPersonAddress = :ContactPersonAddress,\n" +
                "  ContactPersonRole = :ContactPersonRole,\n" +
                "  ContactPersonLoginStatus = :ContactPersonLoginStatus\n" +
                "WHERE ContactPersonId = :ContactPersonId;";
        Map map = new HashMap();
        map.put("ContactPersonName", contactPerson.getContactPersonName());
        map.put("ContactPersonPhone", contactPerson.getContactPersonPhone());
        map.put("ContactPersonEmail", contactPerson.getContactPersonEmail());
        map.put("ContactPersonAddress", contactPerson.getContactPersonAddress());
        map.put("ContactPersonRole", contactPerson.getContactPersonRole());
        map.put("ContactPersonLoginStatus", contactPerson.getContactPersonLoginStatus());
        map.put("ContactPersonId", contactPerson.getContactPersonId());
        super.getNamedParameterJdbcTemplate().update(sql, map);
    }

    @Override
    public void delete(ContactPerson contactPerson) {
        this.delete(contactPerson.getContactPersonId());
    }

    @Override
    public void delete(int id) {
        String sql = "DELETE FROM ContactManagement.contactperson WHERE ContactPersonId = ?";
        getJdbcTemplate().update(sql, id);
    }

    @Override
    public ContactPerson findById(int id) {
        String sql = "SELECT\n" +
                "  ContactPersonId,\n" +
                "  ContactPersonName,\n" +
                "  ContactPersonPhone,\n" +
                "  ContactPersonEmail,\n" +
                "  ContactPersonAddress,\n" +
                "  ContactPersonLoginName,\n" +
                "  ContactPersonRole,\n" +
                "  ContactPersonLoginStatus\n" +
                "FROM\n" +
                "  ContactManagement.contactperson\n"+ 
                " WHERE ContactPersonId = ?";
        ContactPerson contactPerson = getJdbcTemplate().queryForObject(sql, new ContactPersonRowMapper(), id);
        return contactPerson;
    }

    @Override
    public List<ContactPerson> findAll() {
        String sql = "SELECT\n" +
                "  ContactPersonId,\n" +
                "  ContactPersonName,\n" +
                "  ContactPersonPhone,\n" +
                "  ContactPersonEmail,\n" +
                "  ContactPersonAddress,\n" +
                "  ContactPersonLoginName,\n" +
                "  ContactPersonRole,\n" +
                "  ContactPersonLoginStatus\n" +
                "FROM\n" +
                "  ContactManagement.contactperson";
        
        /*List<ContactPerson> contactPersons = getJdbcTemplate().query(sql, new ContactPersonRowMapper());
        return contactPersons;*/
        return getJdbcTemplate().query(sql, new ContactPersonRowMapper());
    }

    @Override
    public List<ContactPerson> findByProperty(String propName, Object propValue) {
        String sql = "SELECT\n" +
                "  ContactPersonId,\n" +
                "  ContactPersonName,\n" +
                "  ContactPersonPhone,\n" +
                "  ContactPersonEmail,\n" +
                "  ContactPersonAddress,\n" +
                "  ContactPersonLoginName,\n" +
                "  ContactPersonRole,\n" +
                "  ContactPersonLoginStatus\n" +
                "FROM\n" +
                "  ContactManagement.contactperson\n" +
                "  WHERE "+propName+" = ?";
        
        /*List<ContactPerson> contactPersons = getJdbcTemplate().query(sql, new ContactPersonRowMapper());
        return contactPersons;*/
        return getJdbcTemplate().query(sql, new ContactPersonRowMapper(),propValue);
    }

}
