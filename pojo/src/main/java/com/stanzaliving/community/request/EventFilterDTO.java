package com.stanzaliving.community.request;

import lombok.*;

import java.util.List;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class EventFilterDTO {
    private List<String> eventType;
    private List<String> eventCategory;
    private List<String> status;
}

