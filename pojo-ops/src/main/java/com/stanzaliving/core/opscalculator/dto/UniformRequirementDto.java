package com.stanzaliving.core.opscalculator.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UniformRequirementDto {
    int regularUniformCount;
    int regularUniformAmountPerPiece;
    int winterUniformCount;
    int winterUniformAmountPerPiece;
}
