package com.example.spring.configproblem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties({NestedConfigProperties.class, BrokenConfigProperties.class})
public class ConfigProblemApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConfigProblemApplication.class, args);
    }
}
