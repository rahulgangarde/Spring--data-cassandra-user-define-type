package com.spring.cassandra.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.cassandra.repository.config.EnableCassandraRepositories;

/**
 * @author rahulgangarde
 */
@SpringBootApplication
@EnableCassandraRepositories
@ComponentScan(basePackages="com.spring.*")
public class SpringDataCassandraMainApplication {
    public static void main(String[] args) throws Exception {       
        SpringApplication.run(SpringDataCassandraMainApplication.class, args);
    }
}
