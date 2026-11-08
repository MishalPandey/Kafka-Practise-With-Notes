package com.mishal.Producer;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class KafkaTopicConfig {

    @Bean
    public NewTopic createMyTopic()
    {
        return new NewTopic("mishal-topic", 3, (short) 1);
    }
}
