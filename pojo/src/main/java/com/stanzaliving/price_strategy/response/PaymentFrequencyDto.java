package com.stanzaliving.price_strategy.response;

import com.stanzaliving.booking.enums.PaymentTerm;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class PaymentFrequencyDto {
    private PaymentTerm paymentTerm;
    private Double monthlyRent;
    private Double totalAmount;
    private Double discountAmount;
    private Boolean isRecommended = false;
    private String waiveOffStrategy;
    private String discountStrategy;
    private Double discountPercentage;
    private List<String> splitUpfrontComponent;
    private String collectionUpfrontComponent;
    private Double processingFee;
    private String paymentTermName;
}
