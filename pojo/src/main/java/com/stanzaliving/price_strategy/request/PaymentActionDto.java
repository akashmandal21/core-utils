package com.stanzaliving.price_strategy.request;

import com.stanzaliving.booking.enums.PaymentTerm;
import lombok.*;

@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Setter
public class PaymentActionDto {

    private PaymentTerm name;
    private Boolean status;
    private Boolean byDefault;
    private String waiveOffStrategy;
    // this discount is different from actual discount
    // it is for installment purpose if someone chooses three installments instead of monthly
    private String discountStrategy;
    private Double discountPercentage;
    private String splitUpfrontComponent;
    private String collectionUpfrontComponent;
    private Double processingFee;

}
