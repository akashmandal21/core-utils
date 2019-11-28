package com.stanzaliving.estimators.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * A DTO representation for {@link EstateInputsEntity} POJO.
 * 
 * @author debendra.dhinda
 */

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class EstateInputEntityDto {

	private long id;

	private long cityId;

	private String cityName;

	private long microMarketId;

	private String microMarketName;

	private long estateId;

	private String estateName;

	private int numberOfRooms;

	private int numberOfBeds;

	private int acRooms;

	private int numberOfFloors;

	private int diningAreas;

	private double totalSquareFeetArea;

	private int buildingBlocks;

	private double opexPerAvailableBed;
	private double opexPerOccupiedBed;

	private String estimateStatus;

}
