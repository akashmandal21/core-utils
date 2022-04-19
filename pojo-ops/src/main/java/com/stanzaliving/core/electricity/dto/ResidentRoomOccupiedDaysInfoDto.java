package com.stanzaliving.core.electricity.dto;

import java.util.Date;

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
	private Date billDurationFrom;
	private Date billDurationTo;
	private Integer billDurationDaysCount;
	
	private Date residentContractFrom;
	private Date residentContractTo;
	private Integer residentContractDaysCount;
	
	private Date residentMoveInDate;
	private Date residentMoveOutDate;
	
	private Date residentRoomOccupiedFrom;
	private Date residentRoomOccupiedTo;
	private Integer residentRoomOccupiedDaysCount;
}