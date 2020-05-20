package com.stanzaliving.po.model;

import lombok.*;

@Data
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PoFinanceAggregationDto {
    private String poUuid;
    private Double totalAmount;
    private Double regularAmount;
    private Double advanceAmount;
    private Integer totalInvoices;
    private String poType;
}
