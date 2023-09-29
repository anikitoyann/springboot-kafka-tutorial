package com.example.springboot.kafka;

import com.example.springboot.payload.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class JsonKafkaConsumer {
    @KafkaListener(topics = "JavaTopicJson", groupId = "myGroup")
    public void consume(User user) {
        log.info(String.format("Json message received-> %s", user.toString()));
    }

}
