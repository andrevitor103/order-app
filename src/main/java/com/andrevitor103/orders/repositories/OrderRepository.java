package com.andrevitor103.orders.repositories;

import com.andrevitor103.orders.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
