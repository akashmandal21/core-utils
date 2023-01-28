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
    private Double paidAmount;
    private Double realisedAmount;
    private Double remainingAmount;
    private Double perDayRent;
    private Double waiveOffAmount;

}
