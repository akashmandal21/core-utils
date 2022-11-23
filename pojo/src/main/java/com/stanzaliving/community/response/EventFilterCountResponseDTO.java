package com.stanzaliving.community.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class EventFilterCountResponseDTO {
    private String categoryUUID;
    private String category;
    private String imageUrl;
    private String eventTypeUUID;
    private String eventType;
    private Integer freeEventCount;
    private Integer count;
}
