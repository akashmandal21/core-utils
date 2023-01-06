package com.stanzaliving.booking.dto;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class EffectiveMonthlyRentDto {
    String bookingUuid;

    Double effectiveMonthlyRent;
}
