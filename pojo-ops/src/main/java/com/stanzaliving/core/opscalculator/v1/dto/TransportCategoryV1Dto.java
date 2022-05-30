package com.stanzaliving.core.opscalculator.v1.dto;

import com.stanzaliving.core.opscalculator.dto.CategoryDto;

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
public class TransportCategoryV1Dto extends CategoryDto {
    private int transportCostPerBedPerMonth;
}
