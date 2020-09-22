package com.stanzaliving.core.opscalculator.dto;

import com.stanzaliving.core.opscalculator.enums.AcType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
public class AcAmcCostSlotDto extends AmcCostSlotDto {
    private List<DropDownDto> acTypeOptions = AcType.getAllAcTypeValues();
    private AcType acType;
}
