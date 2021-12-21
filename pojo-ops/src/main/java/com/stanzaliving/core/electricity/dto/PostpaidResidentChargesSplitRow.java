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
public class PostpaidResidentChargesSplitRow {
	private String residentName;
	private String residentCode;
	private String roomNumber;
	private int bedCount;
	private int bedBooked;
	private int billDurationDaysCount;
	private int residentRoomOccupiedDaysCount;
	private double residentPayableAmount;
	
	private ResidentRoomOccupiedDaysInfoDto occupiedDaysInfoDto;
	private ResidentPayableAmountInfoDto payableAmountInfoDto;

}