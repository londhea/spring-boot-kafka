package com.apache.kafka.demo.config;

import com.apache.kafka.demo.kafkaenum.AppConstant;
import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProducerConfig {

    @Bean
    public NewTopic topic() {
        return new NewTopic(AppConstant.KAFKA_TEST.toString(), 1, (short) 1);
    }
}
