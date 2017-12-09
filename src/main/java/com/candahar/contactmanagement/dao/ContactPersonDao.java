/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.candahar.contactmanagement.dao;

import com.candahar.contactmanagement.domain.ContactPerson;
import java.util.List;

/**
 *
 * @author Jajang Jayus
 */
public interface ContactPersonDao {
    public void save(ContactPerson contactPerson);
    public void update(ContactPerson contactPerson);
    public void delete(ContactPerson contactPerson);
    public void delete(int id);
    public ContactPerson findById(int id);
    public List<ContactPerson> findAll();
    public List<ContactPerson> findByProperty(String propName, Object propValue);
}
