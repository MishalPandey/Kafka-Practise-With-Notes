package com.mishal.Consumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaConsumer {

    @KafkaListener(topics = "my-topic", groupId = "my-new-group")
    public void Listen(String message) {
        System.out.println("Received message 1 : " + message);
    }
    @KafkaListener(topics = "my-topic", groupId = "my-new-group")
    public void Listen2(String message) {
        System.out.println("Received message 2 : " + message);
    }
//    Above 2 belongs to same consumer group so only one can get the message at a time,
//    but below one is different consumer group so it will get all the message
    @KafkaListener(topics = "my-topic", groupId = "my-new-group-1")
    public void Listen3(String message) {
        System.out.println("Received message 3 : " + message);
    }

    @KafkaListener(topics = "mishal-topic", groupId = "my-new-group-rider")
    public void Listen4(RiderLocation location) {
        System.out.println("Received Location : " + location.getRiderId());
    }
}
