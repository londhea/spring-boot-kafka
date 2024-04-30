package com.apache.kafka.demo.controller;

import com.apache.kafka.demo.producer.KafkaProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class KafkaProducerController {

    @Autowired
    KafkaProducer kafkaProducer;

    @GetMapping("/send/message")
    public ResponseEntity<String> sendMessage() {
        kafkaProducer.sendBasicMessage();
        return new ResponseEntity<String>("Message Sent", HttpStatus.OK);
    }
}
