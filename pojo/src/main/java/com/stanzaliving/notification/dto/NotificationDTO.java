package com.stanzaliving.notification.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import java.util.Date;
import java.util.List;
import java.util.Map;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class NotificationDTO {
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
