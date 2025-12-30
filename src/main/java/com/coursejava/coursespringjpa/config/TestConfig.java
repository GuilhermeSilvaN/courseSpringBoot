package com.coursejava.coursespringjpa.config;

import com.coursejava.coursespringjpa.enums.OrderStatus;
import com.coursejava.coursespringjpa.models.*;
import com.coursejava.coursespringjpa.repositories.*;
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

    @Autowired
    private OrderItemRepository orderItemRepository;

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

        p1.getCategories().add(cat2);

        p2.getCategories().add(cat1);
        p2.getCategories().add(cat3);

        p3.getCategories().add(cat3);
        p4.getCategories().add(cat3);

        p5.getCategories().add(cat2);

        productRepository.saveAll(Arrays.asList(p1, p2, p3, p4, p5));

        User u1 = new User(null, "Maria Brown", "maria@gmail.com", "(22) 1 2345-6789", "0000");
        User u2 = new User(null, "Alex Green", "alex@gmail.com", "(00) 1 1234-5678", "1234");

        Order order1 = new Order(u1, Instant.parse("2025-12-15T12:44:00Z"), OrderStatus.PAID);

        Order order2 = new Order(u2, Instant.parse("2025-12-15T12:47:00Z"), OrderStatus.WAITING_PAYMENT);

        Order order3 = new Order(u1, Instant.parse("2025-12-15T12:48:00Z"), OrderStatus.DELIVERED);

        userRepository.save(u1);
        userRepository.save(u2);

        orderRepository.saveAll(Arrays.asList(order1,order2,order3));

        OrderItem oi1 = new OrderItem(order1, p1, 2, p1.getPrice());
        OrderItem oi2 = new OrderItem(order1, p3, 1, p3.getPrice());
        OrderItem oi3 = new OrderItem(order2, p3, 2, p1.getPrice());
        OrderItem oi4 = new OrderItem(order3, p5, 2, p5.getPrice());

        orderItemRepository.saveAll(Arrays.asList(oi1, oi2, oi3, oi4));

        Payment pay1 = new Payment(null, Instant.parse("2025-12-30T19:27:30Z"), order1);

        order1.setPayment(pay1);

        orderRepository.save(order1);

    }
}
