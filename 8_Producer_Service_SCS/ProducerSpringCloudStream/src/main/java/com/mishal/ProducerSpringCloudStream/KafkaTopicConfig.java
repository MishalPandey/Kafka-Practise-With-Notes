package com.mishal.ProducerSpringCloudStream;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class KafkaTopicConfig {

    @Bean
    public NewTopic createMyTopic()
    {
        return new NewTopic("mishal", 2, (short) 1);
    }
}
