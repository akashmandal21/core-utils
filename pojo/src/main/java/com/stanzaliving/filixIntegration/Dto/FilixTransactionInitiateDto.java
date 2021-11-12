package com.stanzaliving.filixIntegration.Dto;

import lombok.*;

@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class FilixTransactionInitiateDto {
    private String paymentId;

    private String pgOrderId;

    private String callbackUrl;

    private Integer amount;

    private String currency;

    @Builder.Default
    private Boolean isEndUserPayingFee = false;

    private String paymentModeKey;
}
