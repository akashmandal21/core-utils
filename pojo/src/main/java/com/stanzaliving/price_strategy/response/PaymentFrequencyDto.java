package com.stanzaliving.price_strategy.response;

import com.stanzaliving.booking.enums.PaymentTerm;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class PaymentFrequencyDto {
    private PaymentTerm paymentTerm;
    private Integer monthlyRent;
    private Integer totalAmount;
    private Integer discountAmount;
    private Boolean isRecommended = false;
    private String waiveOffStrategy;
    private String discountStrategy;
    private Double discountPercentage;
    private String splitUpfrontComponent;
    private String collectionUpfrontComponent;
    private Double processingFee;
}
