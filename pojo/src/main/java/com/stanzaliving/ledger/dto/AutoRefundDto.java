package com.stanzaliving.ledger.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AutoRefundDto {

    private String currentBookingUuid;

    private double amount;

}
