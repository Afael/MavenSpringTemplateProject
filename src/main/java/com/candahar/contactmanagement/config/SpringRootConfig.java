
package com.candahar.contactmanagement.config;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author Jajang Jayus
 */

@Configuration
@ComponentScan(basePackages = {"com.candahar"})
//@ComponentScan(basePackages = {"com.candahar.contactmanagement.dao", "com.candahar.contactmanagement.service"})
public class SpringRootConfig {
    //TODO: Service, DAO, DataSource, Email Sender or Some Other Business Layer Beans
    @Bean
    public BasicDataSource getDataSource(){
        BasicDataSource dataSource = new BasicDataSource();
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/ContactManagement");
        dataSource.setUsername("root");
        dataSource.setPassword("");
        dataSource.setMaxTotal(2);
        dataSource.setInitialSize(1);
        dataSource.setTestOnBorrow(true);
        dataSource.setValidationQuery("SELECT 1");
        dataSource.setDefaultAutoCommit(true);
        return dataSource;
    }
    
}