package com.stanzaliving.booking.dto.request;

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
    private String bookingStatus;
    private String bookingSubStatus;
    private String bookingResidenceType;
    private String bookingType;
    private String userUuid;
    private String contractDuration;
    private Date expectedMoveInDate;
    private Date checkInDate;
    private Date checkoutDate;
    private Date contractStartDate;
    private Date contractEndDate;
    private Date LockinStartDate;
    private Date LockinEndDate;
    private String lockinDuration;
    private String bookingSource;
    private String leadUUid;
    private Date bookingExpirationTime;
    private String roomUuid;
    private String roomNumber;
    private String inventoryUuid;
    private int occupancy;
    private String packageServiceUuid;
    private String commercialCardUuid;
}