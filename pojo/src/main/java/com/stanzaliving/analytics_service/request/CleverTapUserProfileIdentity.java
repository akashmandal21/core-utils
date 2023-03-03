package com.stanzaliving.analytics_service.request;

import lombok.*;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class CleverTapUserProfileIdentity {
    private String identity;
    private Long ts;
    private String type;
    private Object profileData;
}
