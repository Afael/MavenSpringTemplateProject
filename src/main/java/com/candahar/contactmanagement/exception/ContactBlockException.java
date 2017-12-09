/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.candahar.contactmanagement.exception;

/**
 *
 * @author User
 */
public class ContactBlockException extends Exception{

    /**
     * Create Contact object without exception
     */
    public ContactBlockException() {}
    /**
     * Create Contact object with exception
     * @param errDesc
     */
    public ContactBlockException(String errDesc){
        super(errDesc);
    }
}
