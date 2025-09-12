package com.example.notification.model.event;

import com.example.notification.model.enums.GameStateType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
public class NotificationEvent {
    protected String gameName;
    protected String data;
    protected GameStateType gameStateType;
    protected long timestamp;
}
