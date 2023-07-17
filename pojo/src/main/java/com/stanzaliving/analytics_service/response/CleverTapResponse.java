package com.stanzaliving.analytics_service.response;

import lombok.*;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class CleverTapResponse {

    private String status;
    private Integer processed;
}
