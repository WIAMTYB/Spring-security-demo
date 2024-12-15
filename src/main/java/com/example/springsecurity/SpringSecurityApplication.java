package com.example.springsecurity;

import com.example.springsecurity.entities.User;
import com.example.springsecurity.service.AccountService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringSecurityApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringSecurityApplication.class, args);
    }

    @Bean
    CommandLineRunner start(AccountService accountService) {
        return args -> {
            accountService.addNewUser(new User(null, "wiam", "1234"));
            accountService.addNewUser(new User(null, "khaoula", "1234"));
            accountService.addNewUser(new User(null, "nouhaila", "1234"));
            accountService.addNewUser(new User(null, "Ahmed", "1234"));
            accountService.addNewUser(new User(null, "Ali", "1234"));
        };

    }
}



