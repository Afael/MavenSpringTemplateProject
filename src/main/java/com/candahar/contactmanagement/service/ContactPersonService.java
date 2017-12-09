/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.candahar.contactmanagement.service;

import com.candahar.contactmanagement.domain.ContactPerson;
import com.candahar.contactmanagement.exception.ContactBlockException;
import java.util.List;

/**
 *
 * @author User
 */

public interface ContactPersonService {
    
    public static final int LOGIN_STATUS_ACTIVE = 1;
    public static final int LOGIN_STATUS_BLOCKED = 0;
    
    public static final int ROLE_ADMIN = 1;
    public static final int ROLE_USER = 2;
    /**
     * This method handles registration task
     * @param contactPerson is new ContactPerson object
     */
    public void register(ContactPerson contactPerson);
    /**
     * The method handles login operation(authentication) using given credentials,
     * it return ContactPerson Object when success and null when failed
     * When contact person account is blocked an exception will be thrown by this method
     * @param loginName
     * @param password
     * @return 
     * @throws com.candahar.contactmanagement.exception.ContactBlockException when contact person account is blocked
     */
    public ContactPerson login(String loginName, String password) throws ContactBlockException;
    /**
     * This method handles to get list of registered contact person 
     * @return 
     */
    public List<ContactPerson> getContactPersonList();
    /**
     * This method change the contact person login status for details passed as argument
     * @param ContactPersonId
     * @param ContactPersonLoginStatus
     */
    public void changeLoginStatus(int ContactPersonId, int ContactPersonLoginStatus);
}
