package com.bohr.systemconfigserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * 配置中心
 * @author
 */
@EnableConfigServer
@SpringBootApplication
public class SystemConfigServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SystemConfigServerApplication.class, args);
    }

}
