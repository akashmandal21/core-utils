package com.stanzaliving.wanda.response;

import com.stanzaliving.notification.dto.UserNotificationDto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@Builder
@Data
@NoArgsConstructor
public class HomeScreenNotificationResponse {

    private UserNotificationDto nudge;

    private UserNotificationDto survey;

    private int notificationCount;
    
    private List<AddendumResponseDto> addendumResponseDto;
}
