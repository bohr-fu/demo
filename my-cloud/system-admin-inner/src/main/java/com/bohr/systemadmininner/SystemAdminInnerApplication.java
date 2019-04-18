package com.bohr.systemadmininner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * 内部后台管理
 * @author Bohr
 */
@EnableEurekaClient
@EnableFeignClients
@EnableHystrix
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class SystemAdminInnerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SystemAdminInnerApplication.class, args);
    }

}
