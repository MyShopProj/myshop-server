package com.example.myshopserver.shop.service.impl;

import com.example.myshopserver.shop.model.Category;
import com.example.myshopserver.shop.repository.CategoryRepository;
import com.example.myshopserver.shop.service.CategoryService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class CategoryServiceImpl implements CategoryService {
    CategoryRepository categoryRepository;
    @Override
    public List<Category> getAllCategories() {
        return categoryRepository.findAll();
    }

    @Override
    public Category getCategoryById(long id) {
        return categoryRepository.findById(id).orElseThrow(null);
    }
}
