package com.stanzaliving.analytics_service.request;

import lombok.*;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class CleverTapConsumerDto {

    private String userUuid;
    private String event;
    private Object object;

}
