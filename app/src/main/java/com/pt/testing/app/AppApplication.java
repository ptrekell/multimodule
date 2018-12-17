package com.pt.testing.app;


import com.pt.testing.api.Connector;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import javax.annotation.PostConstruct;

@SpringBootApplication
@ComponentScan(basePackages = {"com.pt.testing"})

public class AppApplication {

    @Autowired
    Connector connector;

    public static void main(String[] args) {
        SpringApplication.run(AppApplication.class, args);
    }


    @PostConstruct
    public void init() {
        System.out.println("ok works here we go:");
        System.out.println(connector.getName());
    }

}

