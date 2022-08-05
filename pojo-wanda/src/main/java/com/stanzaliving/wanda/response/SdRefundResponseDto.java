package com.stanzaliving.wanda.response;

import com.stanzaliving.booking.enums.BookingStatus;
import com.stanzaliving.booking.enums.BookingSubStatus;
import com.stanzaliving.booking.enums.BookingType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SdRefundResponseDto {

    private String bookingUuid;
    private BookingStatus bookingStatus;
    private BookingSubStatus bookingSubStatus;
    private BookingType bookingType;
    private String userUuid;
    private String contractStartDate;
    private String contractEndDate;
    private String roomNumber;
    private String occupancyName;
    private String residentId;
    private String residenceName;
    private String microMarketName;
    private String cityName;
    private SdRefundStateDetails moveOutDate;
    private SdRefundStateDetails roomAudit;
    private SdRefundStateDetails refund;
}
