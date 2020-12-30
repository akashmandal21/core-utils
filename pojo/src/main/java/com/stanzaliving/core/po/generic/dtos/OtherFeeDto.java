package com.stanzaliving.core.po.generic.dtos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
@AllArgsConstructor
public class OtherFeeDto {
    private int sequence;
    private String feeName;
    private String feeType;
    private String feeValue;
    private String amountWithoutTax;
    private String gstPercentage;
    private String amountWithTax;
}
