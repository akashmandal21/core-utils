package com.stanzaliving.core.estate.dto;

import java.util.List;

import lombok.Builder;
import lombok.Data;
@Builder
@Data
public class PropertyAnalysisDto {

	private String sizeOfPlot;
	
	private Boolean terraceAccessible;
	
	private String numberOfFloors;
	
	private Boolean stiltAvailable;
	
	private String floorPlateSize;
	
	private Boolean diningSpaceAvailable;
	
	private String diningSpaceSize;
	
	private String permissionsType;
	
	private Boolean waterStorageAvailable;
	
	private String waterStorageSize;

	private String buildingBasis;
	
	private String electricitySupply;
	
	private String buildingState;
	
	private Boolean powerBackupAvailable;
	
	private String powerBackupSize;
	
	private String powerBackupType;
	
	private String operationsType;
	
	private String commonAreaSize;

	private String buildingType;
	
	private Boolean gymAvailable;
	
	private String gymSize;
	
	private String buildingCompletionYear;
	
	private Boolean basementAvailable;
	
	private String basementSize;
	
	private String lastRefurbishedDate;
	
	private Boolean liftAvailable;
	
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
