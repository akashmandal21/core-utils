package com.stanzaliving.core.capexcalculation.dto;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CapexDto {

	private long id;
	
	private long cityId;
	private String cityName;
	
	private long microMarketId;
	private String microMarketName;
	
	private long estateId;
	private String estateName;
	
	private int numberOfBeds;
	private int noOfYearsSinceLastRefurbished;
	private double capexEstimate;
	private String estimateStatus;
	
	private int numberOfRooms;
	private int numberOfFloors;
	private int diningAreas;
	private int buildingBlocks;
	private double totalSquareFeetArea;
	
	private String bdUserId;
	private String pocName;
	
	private String pocEmail;
	
	private String pocContactNumber;
	
	

}
