/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.candahar.contactmanagement.test;

import com.candahar.contactmanagement.config.SpringRootConfig;
import com.candahar.contactmanagement.dao.ContactPersonDao;
import com.candahar.contactmanagement.domain.ContactPerson;
import java.util.List;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 *
 * @author Jajang Jayus
 */
public class TestContactPersonDaoFindAll {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringRootConfig.class);
        ContactPersonDao contactPersonDao = applicationContext.getBean(ContactPersonDao.class);
        //TODO: The user detail will be taken from user_reg_form
        
        List<ContactPerson> contactPersons = contactPersonDao.findAll();
        
        System.out.println("---------Contact Details-----------");
        
        for(ContactPerson contactPerson : contactPersons){
            
        System.out.println(contactPerson.getContactPersonId()+" "+ 
                contactPerson.getContactPersonName()+" "+
                contactPerson.getContactPersonPhone()+" "+
                contactPerson.getContactPersonEmail()+" "+
                contactPerson.getContactPersonAddress()+" "+
                contactPerson.getContactPersonLoginName()+" "+
                contactPerson.getContactPersonRole()+" "+
                contactPerson.getContactPersonLoginStatus());
        
        }
    }
}
