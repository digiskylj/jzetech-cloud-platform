package com.jzetech.cloud.register;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Created by Dylan on 2018/12/15.
 */
@SpringBootApplication
@EnableEurekaServer
public class RegisterServer {

    public static void main(String[] args) {
        SpringApplication.run(RegisterServer.class,args);
    }
}
