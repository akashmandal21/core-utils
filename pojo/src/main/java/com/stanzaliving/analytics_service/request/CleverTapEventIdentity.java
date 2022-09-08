package com.stanzaliving.analytics_service.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CleverTapEventIdentity {
    private String identity;
    private Long ts;
    private String type;
    private String evtName;
    private Object evtData;
}
