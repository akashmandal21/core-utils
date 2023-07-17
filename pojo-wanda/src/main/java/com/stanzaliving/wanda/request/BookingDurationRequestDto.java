package com.stanzaliving.wanda.request;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.stanzaliving.booking.enums.BookingType;
import com.stanzaliving.core.base.StanzaConstants;
import com.stanzaliving.core.base.utils.DateUtil;
import lombok.*;

import java.util.Date;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class BookingDurationRequestDto {

    private BookingType bookingType;

    @JsonFormat(pattern = DateUtil.yyyy_MM_dd_HH_mm_ss, timezone = StanzaConstants.IST_TIMEZONE)
    private Date moveInDate;

    @JsonFormat(pattern = DateUtil.yyyy_MM_dd_HH_mm_ss, timezone = StanzaConstants.IST_TIMEZONE)
    private Date lockInEndDate;
}
