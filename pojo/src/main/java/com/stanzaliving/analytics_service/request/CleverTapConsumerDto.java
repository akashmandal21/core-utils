package com.stanzaliving.analytics_service.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CleverTapConsumerDto {

    private String userUuid;
    private String event;
    private Object object;

}
