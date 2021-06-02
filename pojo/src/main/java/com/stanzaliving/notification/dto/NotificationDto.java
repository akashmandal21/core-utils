package com.stanzaliving.notification.dto;

import lombok.*;

import javax.validation.constraints.NotBlank;
import java.util.Date;
import java.util.List;
import java.util.Map;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class NotificationDto {

    Long id;

    @NotBlank(message = "App Id cannot be empty or null")
    String appName;

    String title;

    String message;

    String callToActionUrl;

    String imageUrl;

    Date date;

    Long timeToLive;

    List<UserParams> userParamsList;

    Map<String, String> data;

}