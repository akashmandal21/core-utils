package com.stanzaliving.core.payment.dto;

import com.stanzaliving.core.payment.enums.PaymentMode;
import com.stanzaliving.core.payment.enums.StanzaPaymentService;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class PaymentLinkRequestDto {

    private Integer amount;
    private String contact;
    private String createdBy;
    private String description;
    private String email;
    private boolean isEndUserPayingFee;
    private Object meta;
    private PaymentMode paymentMode;
    private String paymentSource;
    private StanzaPaymentService stanzaPaymentService;
    private String transactionId;
    private String userId;
}
