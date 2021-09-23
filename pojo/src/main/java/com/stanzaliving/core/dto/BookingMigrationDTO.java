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
    private String bookingNumber;

    @JsonSetter(value = "BOOKING_TYPE")
    private Integer bookingType;

    @JsonSetter(value = "STUDENT_ID")
    private String residentId;

    @JsonSetter(value = "INVENTORY_ID")
    private String inventoryId;

    @JsonSetter(value = "ROOM_ID")
    private String roomId;

    @JsonSetter(value = "HAS_MOVED_IN")
    private boolean hasMovedIn;

    @JsonSetter(value = "CONTRACT_END_DATE")
    private Date contractEndDate;
}
