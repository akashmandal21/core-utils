package com.stanzaliving.community.request;

import lombok.*;

import java.util.List;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class EventFilterDTO {
    private List eventType;
    private List eventCategory;
    private List status;
}

