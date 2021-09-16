package com.stanzaliving.booking.dto.request;

import com.stanzaliving.booking.enums.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
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
    private String auditUuid;
    private String residentId;
    private String residenceUuid;
    private BookingEventEnum bookingEvent;
    private PaymentTerm paymentTerm;
    private boolean hasMovedIn;
}