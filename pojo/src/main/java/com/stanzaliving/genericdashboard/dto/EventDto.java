package com.stanzaliving.genericdashboard.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class EventDto {

    private String eventName;
    private String value;

}
