package com.discphy.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories(basePackages = "com.discphy.core.repository")
@EntityScan(basePackages = "com.discphy.core.entity")
@SpringBootApplication(scanBasePackages = "com.discphy")
public class MultiApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(MultiApiApplication.class, args);
    }

}
