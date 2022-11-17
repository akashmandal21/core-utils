package com.stanzaliving.core.opscalculatorv2.dto;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Builder;
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
@JsonIgnoreProperties({ "count", "rate", "utilization", "margin", "gst" })
public class RepairCategoryV2Dto extends CategoryV2Dto {

	private double manpowerCostPerBed;
	private double materialCostPerBed;
	private double amcCostPerBed;

	private boolean amcCostApplicable;
	private boolean manPowerApplicable;
	private boolean materialCostApplicable;

	private boolean acAmcCostApplicable;
	private boolean dgAmcCostApplicable;
	private boolean liftAmcCostApplicable;
	private boolean roAmcCostApplicable;

	@Builder.Default
	List<AmcCostSlotV2Dto> liftAmcCostSlotDtos = new ArrayList<>();
	private int liftAmcCost;
	@Builder.Default
	List<AmcCostSlotV2Dto> dgAmcCostSlotDtos = new ArrayList<>();
	private int dgAmcCost;
	@Builder.Default
	List<AmcCostSlotV2Dto> roAmcCostSlotDtos = new ArrayList<>();
	private int roAmcCost;
	@Builder.Default
	List<AmcCostSlotV2Dto> acAmcCostSlotDtos = new ArrayList<>();
	private int acAmcCost;

}
