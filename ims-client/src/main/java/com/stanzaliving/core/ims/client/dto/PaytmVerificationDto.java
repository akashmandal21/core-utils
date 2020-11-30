package com.stanzaliving.core.ims.client.dto;

import com.stanzaliving.core.payment.enums.PaymentMode;
import lombok.*;
import lombok.experimental.SuperBuilder;

/**
 * @author harman
 */
@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class PaytmVerificationDto {

    private PaymentMode paymentMode;

    private String paytmNumber;
}
