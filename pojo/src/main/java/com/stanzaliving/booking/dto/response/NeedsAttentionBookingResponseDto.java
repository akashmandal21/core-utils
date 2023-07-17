package com.stanzaliving.booking.dto.response;

import com.stanzaliving.booking.enums.BookingSource;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class NeedsAttentionBookingResponseDto {

    private String bookingUuid;

    private Date needsAttentionExpiryTime;

    private BookingSource source;
}
