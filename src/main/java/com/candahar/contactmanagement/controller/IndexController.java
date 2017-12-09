/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.candahar.contactmanagement.controller;

import com.candahar.contactmanagement.command.LoginCommand;
import com.candahar.contactmanagement.domain.ContactPerson;
import com.candahar.contactmanagement.exception.ContactBlockException;
import com.candahar.contactmanagement.service.ContactPersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author User
 */
@Controller
public class IndexController {

    @Autowired
    private ContactPersonService contactPersonService;

    @RequestMapping(value = {"/", "/index"})
    public String index(Model model) {
        model.addAttribute("command", new LoginCommand());
        return "index"; //JSP - /WEB-INF/view/index.jsp
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String login(@ModelAttribute("command") LoginCommand loginCommand, Model model) {
        try {
            ContactPerson contactPerson = contactPersonService.login(loginCommand.getLoginName(), loginCommand.getPassword());
            if (contactPerson == null) {
                //add error message and go back to login page
                model.addAttribute("err", "Login Failed, Please review your input");
                return "index";
            } else {
                //Success
                //Check the role and redirect to a appropriate dashboard
                switch (contactPerson.getContactPersonRole()) {
                    case ContactPersonService.ROLE_ADMIN:
                        return "redirect:admin/dashboard";
                    case ContactPersonService.ROLE_USER:
                        return "redirect:contact/dashboard";
                    default:
                        //add error message and go back to login page
                        model.addAttribute("err", "Invalid user role");
                        return "index"; // JSP - Login page
                }
            }
        } catch (ContactBlockException ex) {
            //add error message and go back to login page
            model.addAttribute("err", ex.getMessage());
            return "index"; // JSP - Login page
        }
    }

    @RequestMapping(value = "/contact/dashboard")
    public String contactDashboard() {
        return "dashboard_contact"; //JSP - /WEB-INF/view/dashboard_contact.jsp
    }

    @RequestMapping(value = "/admin/dashboard")
    public String adminDashboard() {
        return "dashboard_admin"; //JSP - /WEB-INF/view/dashboard_admin.jsp
    }
}
