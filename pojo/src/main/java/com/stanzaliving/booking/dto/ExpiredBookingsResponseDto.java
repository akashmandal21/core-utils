package com.stanzaliving.booking.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ExpiredBookingsResponseDto {
    private int totalBookingReceivedForExpiration;
    private int countOfSuccessExpiry;
    private int countOfFailureExpiry;

}
