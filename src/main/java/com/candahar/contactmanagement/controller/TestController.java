/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.candahar.contactmanagement.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Jajang Jayus
 */

@Controller
public class TestController {
    @RequestMapping("/hello")
    public String hello(){
        return "hello"; // -> /WEB-INF/view/hello.jsp
    }
}
