package com.stanzaliving.events.dto;


import lombok.*;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString

public class EventDto {
    @NotEmpty
    @NotNull
    private String eventName;


    @NotEmpty
    @NotNull
    private String eventType;
}
