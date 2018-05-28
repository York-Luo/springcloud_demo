package com.luoy.springcloud_sleuth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import zipkin.server.EnableZipkinServer;

@SpringBootApplication
@EnableZipkinServer
public class SpringcloudSleuthApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudSleuthApplication.class, args);
    }
}
