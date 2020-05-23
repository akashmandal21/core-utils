package com.stanzaliving.po.model;

import lombok.*;

@Data
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PoFinanceAggregationDto {
    private String poUuid;
    private String itemCode;
    private String invoiceType;
    private Double quantity;
    private Double totalItemAmount;
    private Double totalWeightedPaidQuantity;
    private Double totalWeightedPaidAmount;
}
