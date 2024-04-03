package com.example.myshopserver.shop.service.impl;

import com.example.myshopserver.shop.model.Product;
import com.example.myshopserver.shop.repository.ProductRepository;
import com.example.myshopserver.shop.service.ProductService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ProductServiceImpl implements ProductService {
    ProductRepository productRepository;
    @Override
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    @Override
    public Product getProductById(long id) {
        return productRepository.findById(id).orElseThrow(null);
    }
}
