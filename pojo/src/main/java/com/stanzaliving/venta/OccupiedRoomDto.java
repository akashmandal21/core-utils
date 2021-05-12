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
public class OccupiedRoomDto implements Serializable{

	private LocalDate date;
	private int occupiedRoomCount;

}
