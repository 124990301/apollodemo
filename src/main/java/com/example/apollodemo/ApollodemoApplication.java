package com.example.apollodemo;

import com.ctrip.framework.apollo.spring.annotation.EnableApolloConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
//@EnableApolloConfig
public class ApollodemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(ApollodemoApplication.class, args);
    }

}
