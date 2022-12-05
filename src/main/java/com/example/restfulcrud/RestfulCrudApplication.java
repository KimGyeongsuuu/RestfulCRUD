package com.example.restfulcrud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
public class RestfulCrudApplication {

    public static void main(String[] args) {
        SpringApplication.run(RestfulCrudApplication.class, args);
    }

}
