package com.stanzaliving.booking.dto.response;

import com.stanzaliving.booking.enums.BookingType;
import lombok.*;

import java.util.Date;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SoldBookingDto {
    private String residenceUuid;
    private String bookingUuid;
    private BookingType bookingType;
    private Date lockInEnd;
    private Date contractStart;
    private Date contractEnd;
    private String lockInDuration;

}
