package com.stanzaliving.core.projectservice.dto;


import com.stanzaliving.core.payment.enums.PaymentMode;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;


@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PaymentDetailDto {
    String paymentUuid;
    PaymentMode paymentMode;
    Date paymentDate;
    String bookingUuid;
    double amount;
}

