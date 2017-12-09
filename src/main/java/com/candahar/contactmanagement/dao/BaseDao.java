/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.candahar.contactmanagement.dao;

import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcDaoSupport;

/**
 *
 * @author Jajang Jayus
 */
abstract public class BaseDao extends NamedParameterJdbcDaoSupport {
    
    @Autowired
    public void setDataSource2(DataSource dataSource){
        super.setDataSource(dataSource);
    }
    
}