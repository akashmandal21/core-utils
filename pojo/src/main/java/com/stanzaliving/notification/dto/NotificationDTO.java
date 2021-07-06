package com.stanzaliving.notification.dto;

import lombok.*;

import javax.validation.constraints.NotBlank;
import java.util.Date;
import java.util.List;
import java.util.Map;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class NotificationDTO {
    private String uuid;

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
