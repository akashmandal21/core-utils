package com.stanzaliving.filixIntegration.Dto;

import com.stanzaliving.core.payment.enums.PaymentMode;
import com.stanzaliving.core.payment.enums.StanzaPaymentService;
import com.stanzaliving.filixIntegration.Enum.PaymentSource;
import lombok.*;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;


@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class FilixPaymentTransactionRequestDto {
    @NotNull(message = "Requester Service is mandatory")
    private StanzaPaymentService stanzaPaymentService;

    @NotBlank(message = "User Id is mandatory")
    private String userId;

    @NotBlank(message = "Internal transaction Id is mandatory")
    private String transactionId;

    @NotNull(message = "Amount is mandatory") @Min(value = 1, message = "Amount cannot be less than 1")
    private Double amount;

    PaymentMode paymentMode;

    @Builder.Default
    private Boolean isEndUserPayingFee = false;

    private String chequeId;

    private String orderId;

    private PaymentSource paymentSource;

    private String chequeImageUrl;

    private String virtualAccountNumber;
}
