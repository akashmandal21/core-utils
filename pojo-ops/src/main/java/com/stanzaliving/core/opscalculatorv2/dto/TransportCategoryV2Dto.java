package com.stanzaliving.core.opscalculatorv2.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
@ToString(callSuper = true)
public class TransportCategoryV2Dto extends CategoryV2Dto {
    private int transportCostPerBedPerMonth;
}
