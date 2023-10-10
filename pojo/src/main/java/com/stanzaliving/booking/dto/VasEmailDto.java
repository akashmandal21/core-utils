package com.stanzaliving.booking.dto;

import com.stanzaliving.booking.enums.BookingEventEnum;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class VasEmailDto {
    private String referenceId;

    private String referenceType;

    private String requestStatus;

    private String requestUuid;

    private VasDto vasDto;

    private BookingEventEnum bookingEventEnum;
}
