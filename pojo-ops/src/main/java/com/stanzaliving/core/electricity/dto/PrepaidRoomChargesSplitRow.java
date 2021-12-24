package com.stanzaliving.core.electricity.dto;

import java.util.List;

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
public class PrepaidRoomChargesSplitRow {
	private String name;
	private String meterCategoryId;
	private Integer sequence;
	private int bedCount;
	private int gridUnit;
	private List<Double> gridUnitList;
	private List<Double> gridUnitGstList;
	private double gridChargesAmount;
	private int dgUnit;
	private double dgChargesAmount;
}