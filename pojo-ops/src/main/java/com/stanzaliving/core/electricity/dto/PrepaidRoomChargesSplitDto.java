package com.stanzaliving.core.electricity.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@ToString(callSuper = true)
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class PrepaidRoomChargesSplitDto {
	private PrepaidRoomChargesSplitRow prepaidRoomChargesSplitRow;
	private String nameTotal;
	private int gridUnitsTotal;
	private double gridChargesTotal;
	private int dgUnitsTotal;
	private double dgChargesTotal;
}