/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.candahar.contactmanagement.test;

import com.candahar.contactmanagement.config.SpringRootConfig;
import com.candahar.contactmanagement.dao.ContactPersonDao;
import com.candahar.contactmanagement.domain.ContactPerson;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 *
 * @author Jajang Jayus
 */
public class TestContactPersonDaoSave {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringRootConfig.class);
        ContactPersonDao contactPersonDao = applicationContext.getBean(ContactPersonDao.class);
        //TODO: The user detail will be taken from user_reg_form
        ContactPerson contactPerson = new ContactPerson();
        contactPerson.setContactPersonName("Anyta Fazmy Elyatine");
        contactPerson.setContactPersonPhone("081221832678");
        contactPerson.setContactPersonAddress("Panyingkiran Sumedang");
        contactPerson.setContactPersonEmail("afael@gmail.com");
        contactPerson.setContactPersonPassword("nyt0190!@");
        contactPerson.setContactPersonLoginName("nyta");
        contactPerson.setContactPersonRole(1); //Admin Role
        contactPerson.setContactPersonLoginStatus(1); //Active
        contactPersonDao.save(contactPerson);
        System.out.println("---------Data Saved-----------");
    }
}
