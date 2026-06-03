package com.juro.otakustream;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.juro.otakustream")
public class OtakuStreamApplication {

    public static void main(String[] args) {
        SpringApplication.run(OtakuStreamApplication.class, args);
    }

}
