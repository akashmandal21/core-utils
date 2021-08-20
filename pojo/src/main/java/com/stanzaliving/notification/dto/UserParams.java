package com.stanzaliving.notification.dto;

import lombok.*;
import java.util.Map;

@ToString
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserParams {

    private String userId;

    private Map<String, String> params;
}
