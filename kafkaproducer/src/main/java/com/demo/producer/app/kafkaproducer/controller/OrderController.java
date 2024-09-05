package com.demo.producer.app.kafkaproducer.controller;

import com.demo.producer.app.kafkaproducer.model.Order;
import com.demo.producer.app.kafkaproducer.service.KafkaProducerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {

    @Autowired
    private KafkaProducerService kafkaProducerService;

    @PostMapping("/order")
    public void order(@RequestBody Order order){
        kafkaProducerService.send(order);
    }

}
