package com.bohr.systemregistrationeurake;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * 注册中心
 * @author Bohr
 */
@EnableEurekaServer
@SpringBootApplication
public class SystemRegistrationEurakeApplication {

    public static void main(String[] args) {
        SpringApplication.run(SystemRegistrationEurakeApplication.class, args);
    }

}
