package com.example.iotdemo.config;

import org.springframework.integration.annotation.MessagingGateway;
import org.springframework.integration.mqtt.support.MqttHeaders;
import org.springframework.messaging.handler.annotation.Header;

@MessagingGateway(defaultRequestChannel = "mqttOutBoundChannel")
public interface MqttGateway {
    void send(String payload, @Header(MqttHeaders.TOPIC) String topic);
}
