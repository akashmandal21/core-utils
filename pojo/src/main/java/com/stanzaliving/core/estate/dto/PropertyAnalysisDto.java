package com.stanzaliving.core.estate.dto;

import java.time.LocalDate;
import java.time.Year;
import java.util.List;

import lombok.Data;

@Data
public class PropertyAnalysisDto {

	private double sizeOfPlot;
	
	private boolean terraceAccessible;
	
	private int numberOfFloors;
	
	private boolean stiltAvailable;
	
	private double floorPlateSize;
	
	private boolean diningSpaceAvailable;
	
	private double diningSpaceSize;
	
	private String permissionsType;
	
	private boolean waterStorageAvailable;
	
	private double waterStorageSize;

	private String buildingBasis;
	
	private String electricitySupply;
	
	private String buildingState;
	
	private boolean powerBackupAvailable;
	
	private String powerBackupSize;
	
	private String powerBackupType;
	
	private String operationsType;
	
	private double commonAreaSize;

	private String buildingType;
	
	private boolean gymAvailable;
	
	private double gymSize;
	
	private Year buildingCompletionYear;
	
	private boolean basementAvailable;
	
	private double basementSize;
	
	private LocalDate lastRefurbishedDate;
	
	private boolean liftAvailable;
	
	private String liftBrand;
	
	private int expectedBedCount;
	
	private int numberOfRoomsWithBalcony;

	private String prelimComments;
	
	private String comments;
	
	private List<RoomLayout> roomLayouts;
	
	private List<WashRoomLayout> washRooms;
	
	private List<BuildingBoundaries> buildingBoundaries;
	
	private List<String> keyPositives;
	
	private List<String> keyNegatives;
	
}
