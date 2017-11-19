package org.olaf.ucbudget.server.config;

import javax.sql.DataSource;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.hibernate5.LocalSessionFactoryBuilder;

@Configuration
public class DatabaseConfiguration {
    @Bean
    public SessionFactory sessionFactory(@Qualifier("dataSource") DataSource datasource){
        return new LocalSessionFactoryBuilder(datasource).scanPackages("org.olaf.ucbudget.server.domain")
                                                         .buildSessionFactory();
    }
}
