package com.stanzaliving.notification.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserLatestSurveyDto {

    private UserNotificationDto nudge;

    private UserNotificationDto survey;

    private int notificationCount;
}