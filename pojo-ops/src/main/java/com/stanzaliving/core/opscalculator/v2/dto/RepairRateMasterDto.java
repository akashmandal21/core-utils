package com.stanzaliving.core.opscalculator.V2.dto;

import java.io.Serializable;
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
public class RepairRateMasterDto implements Serializable {
	private String cityUuid;
	private List<EquipmentRateMasterDto> equipmentRateMasterDto;
}
