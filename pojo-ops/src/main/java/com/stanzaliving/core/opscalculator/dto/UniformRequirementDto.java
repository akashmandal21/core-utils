package com.stanzaliving.core.opscalculator.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UniformRequirementDto {
    int regularUniformCount;
    int regularUniformAmountPerPiece;
    int winterUniformCount;
    int winterUniformAmountPerPiece;
}
