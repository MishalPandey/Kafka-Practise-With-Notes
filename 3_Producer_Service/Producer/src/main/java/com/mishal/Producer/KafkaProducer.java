package com.mishal.Producer;


import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class KafkaProducer {

//    private final KafkaTemplate<String, String> kafkaTemplate;
//
//    public KafkaProducer(KafkaTemplate<String, String> kafkaTemplate) {
//        this.kafkaTemplate = kafkaTemplate;
//    }
//
////  This topic has been already created by CLI
//    @PostMapping("/send")
//    public String send(@RequestParam String message) {
//        kafkaTemplate.send("my-topic", message);
//        return "Message sent successfully: " + message;
//    }

    private final KafkaTemplate<String, RiderLocation> kafkaTemplate;

    public KafkaProducer(KafkaTemplate<String, RiderLocation> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }


//  This topic we have created via KafkaTopicConfig file
    @PostMapping("/send")
    public String sendMishal(@RequestParam String message) {
        RiderLocation location = new RiderLocation("rider123", 37.7749, -122.4194);
        kafkaTemplate.send("mishal-topic", location);
        return "Message sent successfully: " + location.getRiderId();
    }
}
