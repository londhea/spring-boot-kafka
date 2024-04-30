package com.apache.kafka.demo.producer;

import com.apache.kafka.demo.kafkaenum.AppConstant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class KafkaProducer {

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    public void sendBasicMessage() {
        this.kafkaTemplate.send(AppConstant.KAFKA_TEST.toString(), "Hello from Producer on " + new Date());
    }
}
