package com.example.kafka.producer.controller;

import com.example.kafka.producer.Dao.ProductDao;
import com.example.kafka.producer.service.ProductCreationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductCreationController
{
    @Autowired
    ProductCreationService productCreationService;
    @PostMapping("/product/create")
    public String createProduct(@RequestBody ProductDao productDao)
    {
        return productCreationService.createProduct(productDao);
    }
}
