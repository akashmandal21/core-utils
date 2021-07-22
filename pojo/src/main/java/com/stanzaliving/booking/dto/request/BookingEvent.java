package com.stanzaliving.booking.dto.request;

import com.stanzaliving.booking.enums.BookingResidenceType;
import com.stanzaliving.booking.enums.BookingStatus;
import com.stanzaliving.booking.enums.BookingSubStatus;
import com.stanzaliving.booking.enums.BookingType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


import java.io.Serializable;
import java.util.Date;


@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class BookingEvent implements Serializable {
    private String bookingUuid;
    private BookingStatus bookingStatus;
    private BookingSubStatus bookingSubStatus;
    private BookingResidenceType bookingResidenceType;
    private BookingType bookingType;
    private String userUuid;
    private String contractDuration;
    private Date contractStartDate;
    private Date contractEndDate;
    private String leadUUid;
    private String roomUuid;
    private String roomNumber;
    private String inventoryUuid;
    private int occupancy;
    private String packageServiceUuid;
    private String commercialCardUuid;
}