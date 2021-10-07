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

    @JsonSetter(value = "CONTRACT_START_DATE")
    private Date contractStartDate;

    @JsonSetter(value = "CONTRACT_END_DATE")
    private Date contractEndDate;

    @JsonSetter(value = "BOOKING_STATUS")
    private String onboardingStatus;

    @JsonSetter(value = "STUDENT_ID")
    private String residentCode;

    @JsonSetter(value = "INVENTORY_ID")
    private Integer inventoryId;

    @JsonSetter(value = "BOOKING_TYPE")
    private Integer bookingType;

    @JsonSetter(value = "CREATED")
    private Date createdAt;

    @JsonSetter(value = "ACTUAL_CONTRACT_END_DATE")
    private Date actualContractEndDate;

    @JsonSetter(value = "USER_UUID")
    private String userUuid;

    @JsonSetter(value = "ROOM_ID")
    private String roomId;

    @JsonSetter(value = "HAS_MOVED_IN")
    private boolean hasMovedIn;
}
