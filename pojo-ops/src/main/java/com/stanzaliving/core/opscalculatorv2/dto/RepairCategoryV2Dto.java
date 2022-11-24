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

    @Builder.Default
	private double manpowerCostPerBed = 35;
    @Builder.Default
	private double materialCostPerBed = 61;
	private double amcCostPerBed;

	@Builder.Default
	private boolean amcCostApplicable = true;
	@Builder.Default
	private boolean manPowerApplicable = true;
	@Builder.Default
	private boolean materialCostApplicable = true;
	@Builder.Default
	private boolean acAmcCostApplicable = true;
	@Builder.Default
	private boolean dgAmcCostApplicable = true;
	@Builder.Default
	private boolean liftAmcCostApplicable = true;
	@Builder.Default
	private boolean roAmcCostApplicable = true;
	@Builder.Default
	private boolean othersAmcCostApplicable = true;

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
    @Builder.Default
    List<AmcCostSlotV2Dto> othersAmcCostSlotDtos = new ArrayList<>();
    private int othersAmcCost;

}
