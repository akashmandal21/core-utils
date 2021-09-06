package com.stanzaliving.core.security.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SecurityServiceMixDTO {
    private Boolean active;
    private SecurityNightCurfewDTO securityNightCurfewDTO;
}
