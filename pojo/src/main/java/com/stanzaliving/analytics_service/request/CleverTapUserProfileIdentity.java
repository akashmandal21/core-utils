package com.stanzaliving.analytics_service.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CleverTapUserProfileIdentity {
    private String identity;
    private Long ts;
    private String type;
    private Object profileData;
}
