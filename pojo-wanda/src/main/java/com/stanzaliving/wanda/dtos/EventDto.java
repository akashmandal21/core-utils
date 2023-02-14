package com.stanzaliving.wanda.dtos;

import com.stanzaliving.booking.enums.EventType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Data
@NoArgsConstructor
@Builder
public class EventDto {

    private EventType eventType;
    UserOnboardingData data;
}