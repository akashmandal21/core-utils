package com.stanzaliving.community.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class EventSearchResponseDTO {

    private String id;
    private String uuid;
    private String eventID;
    private String name;
    private String eventType;
    private String eventCategory;
}
