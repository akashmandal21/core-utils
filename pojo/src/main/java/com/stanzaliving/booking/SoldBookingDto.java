package com.stanzaliving.booking;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Builder
@Getter
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
