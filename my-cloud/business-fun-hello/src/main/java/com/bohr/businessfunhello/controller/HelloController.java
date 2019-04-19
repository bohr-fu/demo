package com.bohr.businessfunhello.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *  just for learning
 * @author Bohr
 */
@RestController
@RequestMapping("/hello")
public class HelloController {

    @Value("{$server.port}")
    private String port;

    @RequestMapping("/port")
    public String hello(){
        return "hello world ! I am business-fun-hello from port : " + port;
    }
}
