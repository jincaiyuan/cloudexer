package com.walker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class ProviderApp {
    public static void main(String[] args) {
        SpringApplication.run(ProviderApp.class,args);
    }

    @LoadBalanced //添加这个注解之后，就可以使用client name来进行服务的调用
    @Bean
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
