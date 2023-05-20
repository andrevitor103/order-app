package com.andrevitor103.orders.config;

import com.andrevitor103.orders.entities.Order;
import com.andrevitor103.orders.entities.User;
import com.andrevitor103.orders.repositories.OrderRepository;
import com.andrevitor103.orders.repositories.UserRepository;
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
        User userOne = new User(null, "André Vitor", "andrevitor103@gmail.com", "9999999", "12345");
        User userTwo = new User(null, "André Vitor", "andrevitor103@gmail.com", "9999999", "12345");

        Order o1 = new Order(null, Instant.parse("2019-06-20T19:53:07Z"), userOne);
        Order o2 = new Order(null, Instant.parse("2019-07-21T03:42:10Z"), userTwo);
        Order o3 = new Order(null, Instant.parse("2019-07-22T15:21:22Z"), userOne);

        userRepository.saveAll(Arrays.asList(userOne, userTwo));
        orderRepository.saveAll(Arrays.asList(o1, o2, o3));
    }
}
