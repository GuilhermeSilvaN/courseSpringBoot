package com.coursejava.coursespringjpa.config;

import com.coursejava.coursespringjpa.enums.OrderStatus;
import com.coursejava.coursespringjpa.models.Order;
import com.coursejava.coursespringjpa.models.User;
import com.coursejava.coursespringjpa.repositories.OrderRepository;
import com.coursejava.coursespringjpa.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.time.Instant;
import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private OrderRepository orderRepository;

    @Override
    public void run(String... args) throws Exception {
        User u1 = new User(null, "Maria Brown", "maria@gmail.com", "(22) 1 2345-6789", "0000");
        User u2 = new User(null, "Alex Green", "alex@gmail.com", "(00) 1 1234-5678", "1234");

        Order order1 = new Order(u1, Instant.parse("2025-12-15T12:44:00Z"), OrderStatus.PAID);

        Order order2 = new Order(u2, Instant.parse("2025-12-15T12:47:00Z"), OrderStatus.WAITING_PAYMENT);

        Order order3 = new Order(u1, Instant.parse("2025-12-15T12:48:00Z"), OrderStatus.DELIVERED);

        userRepository.save(u1);
        userRepository.save(u2);

        orderRepository.saveAll(Arrays.asList(order1,order2,order3));
    }
}
