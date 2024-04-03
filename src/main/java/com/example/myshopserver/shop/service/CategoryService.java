package com.example.myshopserver.shop.service;

import com.example.myshopserver.shop.model.Category;

import java.util.List;

public interface CategoryService {
    List<Category> getAllCategories();
    Category getCategoryById(long id);
}
