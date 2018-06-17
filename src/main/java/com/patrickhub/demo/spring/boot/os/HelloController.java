package com.patrickhub.demo.spring.boot.os;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Patrick-PC on 17.06.2018.
 */

@RestController
public class HelloController {


    @RequestMapping("hello")
    public String sayHello(){
        return ("Hello, SpringBoot on Wildfly");
    }
}