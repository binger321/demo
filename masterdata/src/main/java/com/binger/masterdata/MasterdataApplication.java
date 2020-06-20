package com.binger.masterdata;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class MasterdataApplication {

    public static void main(String[] args) {
        SpringApplication.run(MasterdataApplication.class, args);
    }

}
