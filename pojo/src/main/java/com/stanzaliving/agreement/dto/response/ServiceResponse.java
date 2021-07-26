package com.stanzaliving.agreement.dto.response;

import lombok.*;

@Builder
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class ServiceResponse {
    private int status;
    private String message;
}
