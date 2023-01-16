package com.stanzaliving.venta_notification.dtos;

import com.stanzaliving.venta_notification.enums.EventType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotEmpty;
import java.util.Map;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class EventDto {

    @NotEmpty(message = "Event can't be empty")
    private EventType event;

    @NotEmpty(message = "EventId can't be empty")
    private String eventId;

    private Map<String, Object> placeholderData;
}
