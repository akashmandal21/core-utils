package com.stanzaliving.core.estate.dto;

import lombok.Data;

@Data
public class RoomLayout {

	private String type;
	
	private double size;

	private int numberOfRooms;
	
	private int numberOfFloors;
}
