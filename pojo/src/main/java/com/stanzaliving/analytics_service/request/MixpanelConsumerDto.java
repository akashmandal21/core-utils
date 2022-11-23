package com.stanzaliving.analytics_service.request;

import lombok.*;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class MixpanelConsumerDto {
    private String userUuid;
    private String mobile;
    private String event;
    private Object object;
}
