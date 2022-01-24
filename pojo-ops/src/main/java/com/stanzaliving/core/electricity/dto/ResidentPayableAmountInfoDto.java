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
public class ResidentPayableAmountInfoDto {
	
	private Double roomPostpaidCharges;
	private Double residentPostpaidCharges;
	private Integer bedsInRoomCount;
	private Integer bookedBedsInRoomCount;
	private Integer billDurationDaysCount;
	private Integer residentRoomOccupiedDaysCount;

}