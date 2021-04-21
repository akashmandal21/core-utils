package com.stanzaliving.venta;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.time.LocalDate;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class DeadBedCountDto implements Serializable{

	private LocalDate date;
	private int deadBedCount;
	private int deadRoomCount;
	private int blockedBedCount;
	private int blockedRoomCount;
	

}
