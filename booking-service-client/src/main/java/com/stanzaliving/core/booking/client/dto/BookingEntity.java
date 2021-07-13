package com.stanzaliving.core.booking.client.dto;

import com.stanzaliving.collector.enums.BookingType;
import com.stanzaliving.core.booking.client.enums.BookingResidenceType;
import com.stanzaliving.core.booking.client.enums.BookingSource;
import com.stanzaliving.core.booking.client.enums.BookingStatus;
import com.stanzaliving.core.booking.client.enums.BookingSubStatus;
import com.stanzaliving.core.sqljpa.entity.AbstractJpaEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BookingEntity extends AbstractJpaEntity {

    private BookingStatus bookingStatus;
    private BookingSubStatus bookingSubStatus;
    private BookingResidenceType bookingResidenceType;
    private BookingType bookingType;
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
    private BookingSource bookingSource;
    private String leadUUid;
    private Date bookingExpirationTime;
}
