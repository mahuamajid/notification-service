package com.example.notification.model.enums;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum GameStateType {
    @JsonProperty("Started") STARTED,
    @JsonProperty("Finished") FINISHED,
    @JsonProperty("Prize Granted") PRIZE_GRANTED;
}
