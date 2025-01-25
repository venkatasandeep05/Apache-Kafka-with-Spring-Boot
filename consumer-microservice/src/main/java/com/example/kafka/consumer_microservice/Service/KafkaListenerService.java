package com.example.kafka.consumer_microservice.Service;

import com.example.kafka.common.Entity.ProductCreatedEvent;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaListenerService
{

    @KafkaListener(topics = "products-topic")
    public void ProductCreatedEventListener(ProductCreatedEvent productCreatedEvent)
    {
        System.out.println("Newly Created Product Details in the below");
        System.out.println("product Id "+productCreatedEvent.getProductId());
        System.out.println("Name "+productCreatedEvent.getName());
        System.out.println("Price "+productCreatedEvent.getPrice());
        System.out.println("Quantity "+productCreatedEvent.getQuantity());
    }
}
