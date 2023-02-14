package com.pedro.strconsumer.listeners;

import com.pedro.strconsumer.custom.StrConsumerCustomListener;
import lombok.extern.log4j.Log4j2;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.annotation.TopicPartition;
import org.springframework.stereotype.Component;

@Log4j2
@Component
public class StrConsumerListener {
    @StrConsumerCustomListener(groupId = "group-1")
    public void create(String message){
        log.info("\n PARTITION 0 ::: Receive message {}", message);
    }

    @StrConsumerCustomListener(groupId = "group-1")
    public void log(String message){
        log.info("\n PARTITION 1 ::: Receive message {}", message);
    }

    @StrConsumerCustomListener(groupId = "group-2")
    public void history(String message){
        log.info("\n HISTORY ::: Receive message {}", message);
    }

}
