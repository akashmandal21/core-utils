package com.stanzaliving.venta;

import com.stanzaliving.venta.enums.EventType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@Data
@NoArgsConstructor
@Builder
public class EventDto<T> {
    private EventType eventType;
    T data;
}