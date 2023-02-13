package com.pedro.strproducer.services;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Log4j2
@RequiredArgsConstructor
@Service
public class StringProducerServices {
    private final KafkaTemplate<String, String> kafkaTemplate;

    public void sendMessage(String message) {
        kafkaTemplate.send("str-topic", message).addCallback(
                success -> {
                    if(success != null){
                        log.info("\n Send message with success: {} Partition: {}, Offset: {}",
                                message,
                                success.getRecordMetadata().partition(),
                                success.getRecordMetadata().offset());
                    }
                },
                error -> log.error("error sending the message")
        );
    }

}
