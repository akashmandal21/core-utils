package com.stanzaliving.core.residenceservice.dto;

import lombok.*;

import java.util.Date;

@Data
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PricingStrategyRequestDto {
    private String cityUuid;
    private String microMarketUuid;
    private String residenceUuid;
    private Date moveIn;
    private Date lockedIn;
}
