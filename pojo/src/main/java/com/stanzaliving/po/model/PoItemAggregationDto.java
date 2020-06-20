package com.stanzaliving.po.model;


import lombok.*;

@Data
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PoItemAggregationDto {

    private String poUuid;
    private String vendorUuid;
    private String itemCode;
    private Double quantity;
    private Double amount;
    private String poType;
}
