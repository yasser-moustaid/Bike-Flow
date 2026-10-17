package com.management.serviceflotte;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ServiceFlotteApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceFlotteApplication.class, args);
    }

}
