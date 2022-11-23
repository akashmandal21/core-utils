package com.stanzaliving.core.cafe.order.dto;

import lombok.*;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@ToString(callSuper = true)
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class ItemAmountDto {
    private Double grossPrice;
    private Double netPrice;
    private Integer quantity;
    private Double amount;
    private Double igst;
    private Double cgst;
    private Double sgst;
    private Double igstPercentage;
    private Double cgstPercentage;
    private Double sgstPercentage;
    private Double totalAmount;
    private Double totalGst;
    private Double marginPercentage;
}
