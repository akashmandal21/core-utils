package com.stanzaliving.core.discount.dto.response;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class DiscountSplitterDto {

    private Integer month;

    private String period;

    private Double totalAmount;

    private Double discountApplied;

    private Double adjustedAmount;

    private Double onmRentalAmount;
}
