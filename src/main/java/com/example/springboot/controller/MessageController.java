package com.example.springboot.controller;

import com.example.springboot.kafka.KafkaProducer;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/v1/kafka")
public class MessageController {
    private final KafkaProducer kafkaProducer;
    //http:localhost:8080/api/v1/kafka/publish?message=hello world

    @GetMapping("/publish")
    public ResponseEntity<String> publish(@RequestParam("message") String message) {
        return ResponseEntity.ok("send message");
    }
}
