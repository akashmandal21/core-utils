package com.stanzaliving.agreement.dto.response;

import lombok.*;

@Builder
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class RequestDto {
    private String expiryDate;
    private boolean expired;
    private String phone;
    private boolean rejected;
    private String name;
    private boolean active;
    private boolean signed;
    private String signType;
    private String signUrl;
    private String email;
}
