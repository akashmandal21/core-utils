package com.stanzaliving.booking.dto.request;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class DiscountRequestDto {

    private String discountCode;

    private String discountStrategyUuid;

    private Double discountValueApplied;

    private Double discountRequested;

    private Double oldDiscountBeforeModification;

    private Double discountValueAppliedAfterStrategy;
}
