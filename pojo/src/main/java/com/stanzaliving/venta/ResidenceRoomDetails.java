package com.stanzaliving.venta;

import java.math.BigDecimal;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;


public class ResidenceRoomDetails {

	private int numberOfBeds;
	private String roomNumber;
	private int floorNumber;
	
	public int getNumberOfBeds() {
		return numberOfBeds;
	}
	public void setNumberOfBeds(int numberOfBeds) {
		this.numberOfBeds = numberOfBeds;
	}
	public String getRoomNumber() {
		return roomNumber;
	}
	public void setRoomNumber(String roomNumber) {
		this.roomNumber = roomNumber;
	}
	public int getFloorNumber() {
		return floorNumber;
	}
	public void setFloorNumber(String floorNumber) {
		this.floorNumber =Integer.parseInt(floorNumber);
	}
	
	
}
