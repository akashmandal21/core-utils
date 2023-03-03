package com.stanzaliving.booking.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ExpiredPendingRequestsResponseDto {
    private int totalRequestsReceivedForExpiration;
    private int countOfSuccessExpiry;
    private int countOfFailureExpiry;
}
