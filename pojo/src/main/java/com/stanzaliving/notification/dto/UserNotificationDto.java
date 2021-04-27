package com.stanzaliving.notification.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.Map;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserNotificationDto {

    String uuid;

    String campaignId;

    String title;

    String message;

    String callToActionUrl;

    String imageUrl;

    Date createdAt;

    Map<String,String> payloadData;

    boolean isSubmitted;
}
