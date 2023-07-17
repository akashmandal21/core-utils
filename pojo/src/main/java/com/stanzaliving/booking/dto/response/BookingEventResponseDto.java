package com.stanzaliving.booking.dto.response;

import java.util.Date;

import com.stanzaliving.booking.enums.BookingEventEnum;
import com.stanzaliving.booking.enums.BookingStatus;
import com.stanzaliving.booking.enums.BookingType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import com.stanzaliving.booking.enums.BookingEventEnum;
import com.stanzaliving.booking.enums.BookingStatus;
import com.stanzaliving.booking.enums.BookingType;
import lombok.*;

import java.util.Date;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class BookingEventResponseDto {

    private String bookingUuid;

    private String residentId;

    private String userUuid;

    private Date contractStartDate;

    private Date contractEndDate;

    private String contractDuration;

    private Date lockinStartDate;

    private Date lockinEndDate;

    private String lockinDuration;

    private BookingStatus bookingStatus;

    private BookingType bookingType;

    private String residentName;

    private String roomNumber;

    private BookingEventEnum bookingEvent;

    private Long daysLeft;

    private String description;
}