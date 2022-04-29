package com.microservicesexample.productmicroservice.controller;

import com.microservicesexample.productmicroservice.entity.ProductEntity;
import com.microservicesexample.productmicroservice.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    ProductRepository productRepository;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<ProductEntity> getAllProducts() {

        return productRepository.findAll();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void createProduct(@RequestBody ProductEntity productEntity) {

        productRepository.save(productEntity);
    }
}
