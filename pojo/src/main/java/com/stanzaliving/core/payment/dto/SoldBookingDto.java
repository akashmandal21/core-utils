package com.stanzaliving.core.payment.dto;

import lombok.*;

import java.util.Date;
import java.util.List;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class SoldBookingDto {
    String inventoryUuid;
    String roomUuid;
    Date contractStartDate;
    Date lockInEndDate;
    Double lockInDuration;
    Double beds;

    List<String> packageService;
}
