package com.stanzaliving.core.discount.dto.response;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BookingDiscountDetailsResponseDto implements Serializable {
    private double discountValueApplied;

    private double discountRequested;

    private double oldDiscountAmount;

    private String discountCode;

    private String strategyUuid;

    private String strategyName;

    private List<String> invoicesDateList;

    private String description;

    @Builder.Default
    private Boolean status = Boolean.FALSE;
    List<BookingDiscountDetails> bookingDiscountDetailsList;
}
