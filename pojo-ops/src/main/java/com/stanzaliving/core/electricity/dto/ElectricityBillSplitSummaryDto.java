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
public class ElectricityBillSplitSummaryDto {
	private double totalBillAmount;
	private double prepaidChargesTotal;
	private double postpaidChargesTotal;
	private PrepaidRoomChargesSplitDto prepaidRoomChargesSplitDto;
	private PostpaidChargesSplitSummaryDto postpaidChargesDto;
}