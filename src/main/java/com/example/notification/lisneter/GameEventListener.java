package com.example.notification.lisneter;

import com.example.common.model.event.NotificationEvent;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class GameEventListener {

//    @KafkaListener(topics = "game-topic", groupId = "dice-game-group")
//    public void message(String payload) {
//        ObjectMapper objectMapper = new ObjectMapper();
//        try {
//            NotificationEvent notificationEvent = objectMapper.readValue(payload, NotificationEvent.class);
//            log.info(notificationEvent.getData());
//        } catch (JsonProcessingException e) {
//            e.printStackTrace();
//        }
//    }

    @KafkaListener(topics = "game-topic", groupId = "dice-game-group")
    public void message(NotificationEvent event) {
        log.info(event.getData());
    }
}
