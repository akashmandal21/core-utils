package com.stanzaliving.agreement.dto.response;

import lombok.*;

@Builder
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class ResponseMessage {
    private String code;
    private String message;
}
