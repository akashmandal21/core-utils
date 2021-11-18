package com.stanzaliving.core.discount.dto.response;


import lombok.*;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BookingDiscountDetails {

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
}
