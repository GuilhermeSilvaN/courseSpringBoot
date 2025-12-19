package com.coursejava.coursespringjpa.config;

import com.coursejava.coursespringjpa.enums.OrderStatus;
import com.coursejava.coursespringjpa.models.Category;
import com.coursejava.coursespringjpa.models.Order;
import com.coursejava.coursespringjpa.models.Product;
import com.coursejava.coursespringjpa.models.User;
import com.coursejava.coursespringjpa.repositories.CategoryRepository;
import com.coursejava.coursespringjpa.repositories.OrderRepository;
import com.coursejava.coursespringjpa.repositories.ProductRepository;
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

    @Autowired
    private CategoryRepository categoryRepository;

    @Autowired
    private ProductRepository productRepository;

    @Override
    public void run(String... args) throws Exception {

        Product p1 = new Product("The Lord of Rings", "Lorem ipsum dolor sit amet, consectetur", 90.5, "");
        Product p2 = new Product("Smart TV", "Nulla eu imperdiet purus. Maecenas ante.", 2190.0, "");
        Product p3 = new Product("Pc gamer", "Donect aliquet odio ac rhoncus cursus.", 1200.00, "");
        Product p4 = new Product("Macbook Pro", "Nam eleifend maximus tortor, at mollis.", 1250.0, "");
        Product p5 = new Product("Rails for Dummies", "Cras fringilla convallis sem vel faucibus.", 100.99, "");

        Category cat1 = new Category("Electronics");
        Category cat2 = new Category("Books");
        Category cat3 = new Category("Computers");

        productRepository.saveAll(Arrays.asList(p1, p2, p3, p4, p5));

        categoryRepository.saveAll(Arrays.asList(cat1, cat2, cat3));

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
