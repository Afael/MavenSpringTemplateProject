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
public class TestContactPersonDaoFindById {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringRootConfig.class);
        ContactPersonDao contactPersonDao = applicationContext.getBean(ContactPersonDao.class);
        //TODO: The user detail will be taken from user_reg_form
        ContactPerson contactPerson = contactPersonDao.findById(2);
        System.out.println("---------Contact Details-----------");
        System.out.println(contactPerson.getContactPersonId());
        System.out.println(contactPerson.getContactPersonName());
        System.out.println(contactPerson.getContactPersonPhone());
        System.out.println(contactPerson.getContactPersonEmail());
        System.out.println(contactPerson.getContactPersonAddress());
        System.out.println(contactPerson.getContactPersonLoginName());
        System.out.println(contactPerson.getContactPersonRole());
        System.out.println(contactPerson.getContactPersonLoginStatus());
        
    }
}
