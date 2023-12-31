package com.stanzaliving.price_strategy.request;

import com.stanzaliving.booking.enums.PaymentTerm;
import lombok.*;

import java.util.List;

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
    private List<String> splitUpfrontComponent;
    private String collectionUpfrontComponent;
    private Double processingFee;
    private WaiveOffType waiveOffType;
    private Double priceImpact;
    private Double monthlyRent;
    private Double discountAmount;
}
