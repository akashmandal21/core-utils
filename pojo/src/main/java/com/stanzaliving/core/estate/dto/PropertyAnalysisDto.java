package com.stanzaliving.core.estate.dto;

import java.util.List;

import lombok.Builder;
import lombok.Data;
@Builder
@Data
public class PropertyAnalysisDto {

	private String sizeOfPlot;
	
	private String terraceAccessible;
	
	private String terraceAreaCoverage;
	
	private String numberOfFloors;
	
	private String stiltAvailable;
	
	private String numberOfRoomsInStilt;
	
	private String floorPlateSize;
	
	private String diningSpaceAvailable;
	
	private String diningSpaceSize;
	
	private String permissionsType;
	
	private String waterStorageAvailable;
	
	private String waterStorageSize;
	
	private List<String> waterStorageSource;

	private String buildingBasis;
	
	private String electricitySupply;
	
	private List<String> electricityLoadType;
	
	private String electricityLoadCapacity;
	
	private String buildingState;
	
	private String powerBackupAvailable;
	
	private String powerBackupSize;
	
	private List<String> powerBackupType;
	
	private String operationsType;
	
	private String commonAreaSize;

	private String buildingType;
	
	private String gymAvailable;
	
	private String gymSize;
	
	private String buildingCompletionYear;
	
	private String basementAvailable;
	
	private String basementSize;
	
	private String lastRefurbishedDate;
	
	private String liftAvailable;
	
	private String liftBrand;
	
	private String expectedBedCount;
	
	private String numberOfRoomsWithBalcony;

	private String prelimComments;
	
	private String comments;
	
	private List<RoomLayout> roomLayouts;
	
	private List<WashRoomLayout> washRooms;
	
	private BuildingBoundaries buildingBoundaries;
	
	private List<String> keyPositives;
	
	private List<String> keyNegatives;
	
	
}
