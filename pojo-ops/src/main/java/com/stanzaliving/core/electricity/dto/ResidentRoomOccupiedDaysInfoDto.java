package com.stanzaliving.core.electricity.dto;

import java.time.LocalDate;

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
public class ResidentRoomOccupiedDaysInfoDto {
	private LocalDate billDurationFrom;
	private LocalDate billDurationTo;
	private Integer billDurationDaysCount;
	
	private LocalDate residentContractFrom;
	private LocalDate residentContractTo;
	private Integer residentContractDaysCount;
	
	private LocalDate residentMoveInDate;
	private LocalDate residentMoveOutDate;
	
	private LocalDate residentRoomOccupiedFrom;
	private LocalDate residentRoomOccupiedTo;
	private Integer residentRoomOccupiedDaysCount;
}