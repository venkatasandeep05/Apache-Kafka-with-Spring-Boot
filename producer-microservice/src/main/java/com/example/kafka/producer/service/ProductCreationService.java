package com.example.kafka.producer.service;

import com.example.kafka.common.Entity.ProductCreatedEvent;
import com.example.kafka.producer.Dao.ProductDao;
import org.apache.kafka.common.serialization.StringSerializer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.serializer.JsonSerializer;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class ProductCreationService
{
    @Autowired
    KafkaTemplate<String,ProductCreatedEvent> kafkaTemplate;

    public String createProduct(ProductDao productDao)
    {
        String productId= UUID.randomUUID().toString();
        ProductCreatedEvent productCreatedEvent=new ProductCreatedEvent();
        productCreatedEvent.setQuantity(productDao.getQuantity());
        productCreatedEvent.setPrice(productDao.getPrice());
        productCreatedEvent.setName(productDao.getName());
        productCreatedEvent.setProductId(productId);
        kafkaTemplate.send("products-topic",productId,productCreatedEvent);
        return "product cretead successfully. "+"Product ID is "+productId;
    }
}
