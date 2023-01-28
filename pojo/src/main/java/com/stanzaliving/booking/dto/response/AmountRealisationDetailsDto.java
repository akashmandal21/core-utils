package com.stanzaliving.booking.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AmountRealisationDetailsDto {
    private String paidAmount;
    private String realisedAmount;
    private String remainingAmount;
    private String perDayRent;
    private Double waiveOffAmount;

}
