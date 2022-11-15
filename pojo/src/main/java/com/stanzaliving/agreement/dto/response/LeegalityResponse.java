package com.stanzaliving.agreement.dto.response;

import lombok.*;

@Builder
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class LeegalityResponse {
    private ResponseMessage message;
    private ResponseData data;
    private String status;
}
