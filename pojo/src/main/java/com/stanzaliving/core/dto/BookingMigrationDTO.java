package com.stanzaliving.core.dto;

import com.fasterxml.jackson.annotation.JsonSetter;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BookingMigrationDTO {

    @JsonSetter(value = "BOOKING_ID")
    private Integer bookingNumber;

    @JsonSetter(value = "CONTRACT_START_DATE")
    private Date contractStartDate;

    @JsonSetter(value = "CONTRACT_END_DATE")
    private Date contractEndDate;

    @JsonSetter(value = "BOOKING_STATUS")
    private String onboardingStatus;

    @JsonSetter(value = "STUDENT_ID")
    private String residentId;

    @JsonSetter(value = "INVENTORY_ID")
    private Integer inventoryId;
}
