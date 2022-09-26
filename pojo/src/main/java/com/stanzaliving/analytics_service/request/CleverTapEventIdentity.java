package com.stanzaliving.analytics_service.request;

import lombok.*;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class CleverTapEventIdentity {
    private String identity;
    private Long ts;
    private String type;
    private String evtName;
    private Object evtData;
}
