package com.dudacf26.zenvia.kafkaPoc.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class Consumer {

    private final Logger logger = LoggerFactory.getLogger(Producer.class);
    private static final String TOPIC = "users";

    @KafkaListener(topics = TOPIC , groupId = "id_do_grupo")
    public void consume(String message) throws IOException {
        logger.info(String.format("******* -> Consumindo a mensagem -> %s", message));
    }
}
