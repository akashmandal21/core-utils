package com.stanzaliving.core.opscalculatorv2.dto;

import java.io.Serializable;

import com.stanzaliving.core.opscalculator.enums.EquipmentType;

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
public class EquipmentRateMasterDto implements Serializable {
	private EquipmentType equipmentType;
	private String equipmentCapicity;
	private String equipmentAmcRatePerYear;

}
