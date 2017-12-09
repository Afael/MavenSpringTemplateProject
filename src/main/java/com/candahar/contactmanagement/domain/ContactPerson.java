/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.candahar.contactmanagement.domain;

/**
 *
 * @author Jajang Jayus
 */
public class ContactPerson {
    
  private Integer ContactPersonId;
  private String ContactPersonName;
  private String ContactPersonPhone;
  private String ContactPersonEmail;
  private String ContactPersonAddress;
  private String ContactPersonLoginName;
  private String ContactPersonPassword;
  private Integer ContactPersonRole;
  private Integer ContactPersonLoginStatus;

    public Integer getContactPersonId() {
        return ContactPersonId;
    }

    public void setContactPersonId(Integer ContactPersonId) {
        this.ContactPersonId = ContactPersonId;
    }

    public String getContactPersonName() {
        return ContactPersonName;
    }

    public void setContactPersonName(String ContactPersonName) {
        this.ContactPersonName = ContactPersonName;
    }

    public String getContactPersonPhone() {
        return ContactPersonPhone;
    }

    public void setContactPersonPhone(String ContactPersonPhone) {
        this.ContactPersonPhone = ContactPersonPhone;
    }

    public String getContactPersonEmail() {
        return ContactPersonEmail;
    }

    public void setContactPersonEmail(String ContactPersonEmail) {
        this.ContactPersonEmail = ContactPersonEmail;
    }

    public String getContactPersonAddress() {
        return ContactPersonAddress;
    }

    public void setContactPersonAddress(String ContactPersonAddress) {
        this.ContactPersonAddress = ContactPersonAddress;
    }

    public String getContactPersonLoginName() {
        return ContactPersonLoginName;
    }

    public void setContactPersonLoginName(String ContactPersonLoginName) {
        this.ContactPersonLoginName = ContactPersonLoginName;
    }

    public String getContactPersonPassword() {
        return ContactPersonPassword;
    }

    public void setContactPersonPassword(String ContactPersonPassword) {
        this.ContactPersonPassword = ContactPersonPassword;
    }

    public Integer getContactPersonRole() {
        return ContactPersonRole;
    }

    public void setContactPersonRole(Integer ContactPersonRole) {
        this.ContactPersonRole = ContactPersonRole;
    }

    public Integer getContactPersonLoginStatus() {
        return ContactPersonLoginStatus;
    }

    public void setContactPersonLoginStatus(Integer ContactPersonLoginStatus) {
        this.ContactPersonLoginStatus = ContactPersonLoginStatus;
    }
  
}
