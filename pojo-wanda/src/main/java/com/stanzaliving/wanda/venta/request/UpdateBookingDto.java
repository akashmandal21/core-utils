package com.stanzaliving.wanda.venta.request;

import com.stanzaliving.booking.enums.BookingSource;
import com.stanzaliving.booking.enums.BookingStatus;
import lombok.Data;

@Data
public class UpdateBookingDto {

    private String userUuid;
    private BookingStatus bookingStatus;
    private BookingSource bookingSource;
    private String bookingSubStatus;
}
