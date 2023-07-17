package com.stanzaliving.core.electricity.dto.bill;

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
public class RoomDetailDto {

	private String roomNumber;
	private String userName;
	private Integer bedCount;
	private Integer occupiedBedCount;
	private Integer bedBookedCount;
	private String userCode;
	private LocalDate residentContractFrom;
	private LocalDate residentContractTo;
	private int residentContractDaysCount;
	private LocalDate residentMoveInDate;
	private LocalDate residentMoveOutDate;
	private LocalDate residentRoomOccupiedFrom;
	private LocalDate residentRoomOccupiedTo;
	private int residentRoomOccupiedDaysCount;	
	private LocalDate billDurationFrom;
	private LocalDate billDurationTo;
	private int billDurationDaysCount;
		
}