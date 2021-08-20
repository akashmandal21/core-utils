package com.stanzaliving.core.far.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class EditAdditionalDetailsDto {
    private String brandName;
    private String modelName;
    private String serialNumber;
    private String assetCondition;
}
