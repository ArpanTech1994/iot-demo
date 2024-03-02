package com.example.iotdemo.controller;

import com.example.iotdemo.config.MqttGateway;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/mqtt")
public class MqttRequestSender {

    @Autowired
    private MqttGateway mqttGateway;

    @PostMapping("/sendMessage")
    public ResponseEntity<?> publishMessageToMQTTTopic(@RequestBody String mqttMessageFromClient){

        try {
            JsonObject convertObject = new Gson().fromJson(mqttMessageFromClient, JsonObject.class);
            mqttGateway.send(convertObject.get("message").toString(), convertObject.get("topic").toString());
            return ResponseEntity.ok("Success");
        }catch(Exception ex) {
            ex.printStackTrace();
            return ResponseEntity.ok("fail");
        }
    }
}
