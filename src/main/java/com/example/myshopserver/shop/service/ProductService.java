package com.example.myshopserver.shop.service;

import com.example.myshopserver.shop.model.Product;

import java.util.List;

public interface ProductService {
    List<Product> getAllProducts();
    Product getProductById(long id);
}
