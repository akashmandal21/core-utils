package com.stanzaliving.price_strategy.response;

import com.stanzaliving.booking.enums.PaymentTerm;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class PaymentFrequencyDto {

    private Double monthlyRent;
    private Double totalAmount;
    private Double priceImpact;
    private Double processingFee;
    private Double discountAmount;
    private Double discountPercentage;

    private String gstAmountLabel;
    private String showMonthlyRent;
    private String showTotalAmount;
    private String paymentTermName;
    private String waiveOffStrategy;
    private String discountStrategy;
    private String showDiscountAmount;
    private String collectionUpfrontComponent;
    private String monthlyRentExclusiveGstAmountLabel;

    private Boolean isRecommended;

    private PaymentTerm paymentTerm;

    private List<String> splitUpfrontComponent;

}