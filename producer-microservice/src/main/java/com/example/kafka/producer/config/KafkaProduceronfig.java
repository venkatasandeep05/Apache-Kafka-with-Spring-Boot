package com.example.kafka.producer.config;

import com.example.kafka.common.Entity.ProductCreatedEvent;
import org.apache.kafka.clients.producer.Producer;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.common.protocol.types.Field;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.core.DefaultKafkaProducerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.core.ProducerFactory;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

@Configuration
public class KafkaProduceronfig
{
    @Value("${spring.kafka.producer.bootstrap-server}")
    private String bootStrapServer;

    @Value("${spring.kafka.producer.key-serializer}")
    private String keySerializer;

    @Value("${spring.kafka.producer.value-serializer}")
    private String valueSerializer;
    Map<String,Object> producerConfigs()
    {
        Map<String,Object> config=new HashMap<>();
        config.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG,bootStrapServer);
        config.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG,keySerializer);
        config.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG,valueSerializer);
        return config;
        }

        @Bean
    ProducerFactory<String, ProductCreatedEvent> producerFactory()
        {
            return new DefaultKafkaProducerFactory<>(producerConfigs());
        }

        @Bean
        KafkaTemplate<String,ProductCreatedEvent> kafkaTemplate()
        {
            return new KafkaTemplate<>(producerFactory());
        }
}
