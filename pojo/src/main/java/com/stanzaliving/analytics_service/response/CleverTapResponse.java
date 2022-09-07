package com.stanzaliving.analytics_service.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CleverTapResponse {

    private String status;
    private Integer processed;
}
