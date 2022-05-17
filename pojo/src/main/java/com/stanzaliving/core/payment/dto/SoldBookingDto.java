package com.stanzaliving.core.payment.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.Date;

@Builder
@Getter
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
