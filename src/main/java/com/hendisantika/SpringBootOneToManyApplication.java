package com.hendisantika;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class SpringBootOneToManyApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootOneToManyApplication.class, args);
    }

}
