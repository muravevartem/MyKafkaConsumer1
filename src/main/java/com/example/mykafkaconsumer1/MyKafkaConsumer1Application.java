package com.example.mykafkaconsumer1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.KafkaListener;

@SpringBootApplication
public class MyKafkaConsumer1Application {

    public static void main(String[] args) {
        SpringApplication.run(MyKafkaConsumer1Application.class, args);
    }

    @KafkaListener(topics = "test-topic", id = "my-kafka-conusmer")
    public void listen(TestModel model) {
        System.out.println(model);
    }

}
