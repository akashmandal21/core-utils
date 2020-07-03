package com.stanzaliving.collector.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@Data
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
public class BookingSecurityAdvanceRecordDto {
    private String bookingUuid;
    private Double securityAmount;
    private Double advanceRentalAmount; //as on current date
}
