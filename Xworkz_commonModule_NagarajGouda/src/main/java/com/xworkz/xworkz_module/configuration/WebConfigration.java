package com.xworkz.xworkz_module.configuration;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import javax.sql.DataSource;

@Configuration
@Slf4j
@EnableWebMvc
@ComponentScan("com.xworkz.xworkz_module")
public class WebConfigration {
    WebConfigration(){
        System.out.println("This a WebConfigration Class..");
    }

    @Bean
    public LocalContainerEntityManagerFactoryBean localContainerEntityManagerFactoryBean(){
        LocalContainerEntityManagerFactoryBean bean=new LocalContainerEntityManagerFactoryBean();
        log.info("hello");
        bean.setPackagesToScan("com.xworkz.project.entity");
        bean.setDataSource(dataSource());
        bean.setJpaVendorAdapter(new HibernateJpaVendorAdapter());
        return bean;
    }

    @Bean
    public DataSource dataSource(){
        DriverManagerDataSource driverManagerDataSource=new DriverManagerDataSource();
        driverManagerDataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        driverManagerDataSource.setUrl("jdbc:mysql://localhost:3306/user_db");
        driverManagerDataSource.setUsername("root");
        driverManagerDataSource.setPassword("Nagaraj@007");
        return  driverManagerDataSource;
    }
}
