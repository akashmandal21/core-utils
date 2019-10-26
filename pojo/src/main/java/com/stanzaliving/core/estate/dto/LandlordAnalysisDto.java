package com.stanzaliving.core.estate.dto;

import java.util.List;

import lombok.Data;

@Data
public class LandlordAnalysisDto {

	private String commentsOnKeyPositives;
	
	private String commentsOnKeyNegatives;
	
	private List<RoomLayout> roomLayouts;
	
	private List<WashRoomLayout> washRooms;
	
	private List<BuildingBoundaries> buildingBoundaries;
	
	private List<String> keyPositives;
	
	private List<String> keyNegatives;
	
	private List<LandlordInfoDto> landlordInfoDtos;
	
}
