package com.apache.kafka.demo.consumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaConsumer {

    @KafkaListener(topics = "kafka-test", groupId = "basic-msg-group")
    public void sendBasicMessage(String message) {
        System.out.println("Inside listener");
        System.out.println("Received Message in group basic-msg-group : "+ message);
        System.out.println("Exit listener");
    }


}
