package com.bohr.businessfunhello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * 业务工程
 * @author Bohr
 */
@EnableEurekaClient
@EnableFeignClients
@EnableHystrix
@SpringBootApplication(exclude= {DataSourceAutoConfiguration.class})
public class BusinessFunHelloApplication {

    public static void main(String[] args) {
        SpringApplication.run(BusinessFunHelloApplication.class, args);
    }

}
