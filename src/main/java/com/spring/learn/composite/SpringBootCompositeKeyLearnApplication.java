package com.spring.learn.composite;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class SpringBootCompositeKeyLearnApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootCompositeKeyLearnApplication.class, args);
    }

}
