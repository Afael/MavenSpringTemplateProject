/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.candahar.contactmanagement.test;

import com.candahar.contactmanagement.config.SpringRootConfig;
import com.candahar.contactmanagement.domain.ContactPerson;
import com.candahar.contactmanagement.service.ContactPersonService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 *
 * @author Jajang Jayus
 */
public class TestContactPersonServiceRegister {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringRootConfig.class);
        ContactPersonService contactPersonService = applicationContext.getBean(ContactPersonService.class);
        //TODO: The user detail will be taken from user_reg_form
        ContactPerson contactPerson = new ContactPerson();
        contactPerson.setContactPersonName("Amanda Fazmy");
        contactPerson.setContactPersonPhone("082342129900");
        contactPerson.setContactPersonAddress("Panyingkiran Sumedang");
        contactPerson.setContactPersonEmail("afazmy@gmail.com");
        contactPerson.setContactPersonPassword("afazmy!@");
        contactPerson.setContactPersonLoginName("amanda");
        contactPerson.setContactPersonRole(ContactPersonService.ROLE_ADMIN);
        contactPerson.setContactPersonLoginStatus(ContactPersonService.LOGIN_STATUS_ACTIVE);
        contactPersonService.register(contactPerson);
        System.out.println("---------Contact Registered Successfully-----------");
    }
}
