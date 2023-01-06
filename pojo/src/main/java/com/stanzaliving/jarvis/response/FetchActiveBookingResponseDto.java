package com.stanzaliving.jarvis.response;

import com.stanzaliving.booking.enums.BookingResidenceType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Getter
public class FetchActiveBookingResponseDto {

    private String userUuid;
    private String bookingUuid;
    private Date contractStartDate;
    private Date contractEndDate;
    private Date moveInDate;
    private Date moveOutDate;
    private boolean moveIn;
    private String bookingStatus;
    private String bookingSubStatus;
    private String bookingType;
    private BookingResidenceType bookingResidenceType;

}
