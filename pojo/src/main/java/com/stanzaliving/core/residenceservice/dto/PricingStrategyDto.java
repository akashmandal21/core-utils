package com.stanzaliving.core.residenceservice.dto;

import lombok.*;

import java.util.Date;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class PricingStrategyDto {

    private String residenceUuid;

    private String microMarketUuid;

    private String cityUuid;

    private Double lockInDuration;

    private Date fromDate;

    private Date toDate;
}
