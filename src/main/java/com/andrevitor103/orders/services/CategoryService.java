package com.andrevitor103.orders.services;

import com.andrevitor103.orders.entities.Category;
import com.andrevitor103.orders.entities.User;
import com.andrevitor103.orders.repositories.CategoryRepository;
import com.andrevitor103.orders.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository repository;

    public List<Category> findAll() {
        return repository.findAll();
    }

    public Category findById(Long id) {
        return repository.findById(id).orElseThrow(() -> new RuntimeException("Category not found"));
    }
}
