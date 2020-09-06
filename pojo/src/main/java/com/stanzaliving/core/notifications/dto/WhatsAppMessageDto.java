package com.stanzaliving.core.notifications.dto;

import lombok.Data;

@Data
public class WhatsAppMessageDto {
    private String phone;
    private String method;
    private String topic;
    private String title;
    private String messageType;
    private String message;
    private Boolean isButtonTemplate = false;
    private String buttonUrlParam;
    private String location;
    private Boolean isOpt = false;
    private Boolean messageTwoWay = false;
}
