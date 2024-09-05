package com.demo.producer.app.kafkaproducer.service;

import com.demo.producer.app.kafkaproducer.model.Order;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@Log4j2
public class KafkaProducerService {

    private static final String TOPIC_NAME = "user";

    @Autowired
    private KafkaTemplate<String, Order> kafkaTemplate;

    public void send(Order order){
        log.info("Order object is {}",order);
        kafkaTemplate.send(TOPIC_NAME, UUID.randomUUID().toString(),order);
    }
}
