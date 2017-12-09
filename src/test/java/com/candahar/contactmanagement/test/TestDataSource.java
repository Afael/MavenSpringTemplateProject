/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.candahar.contactmanagement.test;

import com.candahar.contactmanagement.config.SpringRootConfig;
import javax.sql.DataSource;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 *
 * @author Jajang Jayus
 */
public class TestDataSource {
    
    public static void main(String[] arg){
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringRootConfig.class);
        DataSource dataSource = context.getBean(DataSource.class);
        JdbcTemplate jt = new JdbcTemplate(dataSource);
        String sql = "INSERT INTO ContactManagement.contactperson (\n" +
                        "  ContactPersonName,\n" +
                        "  ContactPersonPhone,\n" +
                        "  ContactPersonEmail,\n" +
                        "  ContactPersonAddress,\n" +
                        "  ContactPersonLoginName,\n" +
                        "  ContactPersonPassword" +
                        ") VALUES (?, ?, ?, ?, ?, ?)";
        
        Object[] param = new Object[]{"Jajang Jaenal Yusup", "082111455499"
                , "jajangjayuz87@gmail.com", "Jakarta Pusat", "afael", "4f43L87!@"};
        jt.update(sql, param);
        System.out.println("----------SQL EXECUTED-------------");
    }
    
}
