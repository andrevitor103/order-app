package com.andrevitor103.orders.repositories;

import com.andrevitor103.orders.entities.Category;
import com.andrevitor103.orders.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
