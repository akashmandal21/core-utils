package com.stanzaliving.core.payment.dto;

import lombok.*;

import java.util.Date;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class SoldBookingDto {
    String inventoryUuid;
    String roomUuid;
    Date csd;
    Date led;
    Integer lockInDuration;
    Double beds;
}
