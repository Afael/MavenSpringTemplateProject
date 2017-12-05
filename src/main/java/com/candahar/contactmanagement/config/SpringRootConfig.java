
package com.candahar.contactmanagement.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author Jajang Jayus
 */

@Configuration
@ComponentScan(basePackages = {"com.candahar"})
public class SpringRootConfig {
    //TODO: Service, DAO, DataSource, Email Sender or Some Other Business Layer Beans
}