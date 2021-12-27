package com.stanzaliving.booking.dto.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.stanzaliving.core.payment.enums.PaymentMode;
import com.stanzaliving.core.payment.enums.PaymentStatus;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)    //  ignore all null fields
public class BookingRequestDto {

    private String bookingId;

    private String userUuid;

    private PaymentMode paymentMode;

    private double amount;

    private PaymentStatus paymentStatus;

    private String merchantTransactionId;

    private Long paymentId;

}
