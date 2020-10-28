package com.stanzaliving.core.notifications.dto;

import lombok.Builder;
import lombok.Builder.Default;
import lombok.Data;

@Data
@Builder
public class WhatsAppMessageDto {
    private String phone;
    private String method;
    private String topic;
    private String title;
    private String messageType;
    private String message;
    @Default
    private Boolean isButtonTemplate = false;
    private String buttonUrlParam;
    private String location;
    @Default
    private Boolean isOpt = false;
    @Default
    private Boolean messageTwoWay = false;
}
