package com.stanzaliving.agreement.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class Config {
    private String id;
    private String passKey;
    private Integer verifyYob;
    private String authTypes;

}
