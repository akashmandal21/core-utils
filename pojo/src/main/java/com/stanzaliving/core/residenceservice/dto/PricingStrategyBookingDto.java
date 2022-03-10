package com.stanzaliving.core.residenceservice.dto;

import lombok.*;

import java.util.Date;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PricingStrategyBookingDto {
    private String uuid;
    private String status;
    private String rulesUuid;
    private String discount;
    private Date fromDate;
    private Date toDate;
}
