package com.andrevitor103.orders.repositories;

import com.andrevitor103.orders.entities.Category;
import com.andrevitor103.orders.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
