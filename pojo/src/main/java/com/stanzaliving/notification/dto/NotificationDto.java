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

    private Long id;

    @NotBlank(message = "App Id cannot be empty or null")
    private String appName;

    private String title;

    private String message;

    private String callToActionUrl;

    private String imageUrl;

    private Date date;

    private Long timeToLive;

    private List<UserParams> userParamsList;

    private Map<String, String> data;

}