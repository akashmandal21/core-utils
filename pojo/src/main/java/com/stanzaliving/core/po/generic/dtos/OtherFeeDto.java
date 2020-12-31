package com.stanzaliving.core.po.generic.dtos;

import lombok.*;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class OtherFeeDto {
    private int sequence;
    private String feeName;
    private String feeType;
    private String feeValue;
    private String amountWithoutTax;
    private String gstPercentage;
    private String amountWithTax;
}
