package com.stanzaliving.core.opscalculator.v1.dto;

import java.util.List;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@SuperBuilder
@NoArgsConstructor
@ToString(callSuper = true)
public class RepairRateMasterDto {
	private String cityUuid;
	private List<EquipmentRateMasterDto> equipmentRateMasterDto;
}
