package com.coursejava.coursespringjpa.config;

import com.coursejava.coursespringjpa.models.User;
import com.coursejava.coursespringjpa.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {
        User u1 = new User(null, "Maria Brown", "maria@gmail.com", "(22) 1 2345-6789", "0000");
        User u2 = new User(null, "Alex Green", "alex@gmail.com", "(00) 1 1234-5678", "1234");

        userRepository.save(u1);
        userRepository.save(u2);
    }
}
