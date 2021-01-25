package com.stanzaliving.po.model;

import lombok.*;

import java.util.List;

@Data
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PoAggregationDto {
    private List<PoItemAggregationDto> poItems;
    private List<PoFinanceAggregationDto> poPayments;
}
