package com.example.myshopserver.shop.controller;

import com.example.myshopserver.shop.model.Product;
import com.example.myshopserver.shop.service.ProductService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/shop/products")
@AllArgsConstructor
public class ProductController {
    private ProductService productService;

    @GetMapping
    public List<Product> getAllEvents(){
        return productService.getAllProducts();
    }

    @GetMapping("{id}")
    public ResponseEntity<Product> getProductById(@PathVariable("id") long productId){
        return new ResponseEntity<Product>(productService.getProductById(productId), HttpStatus.OK);
    }
}
