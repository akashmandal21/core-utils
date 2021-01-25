/**
 * 
 */
package com.stanzaliving.designservice.response.dto;

import java.util.List;
import java.util.Map;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author raj.kumar
 *
 */
@Getter
@Setter
@ToString
public class LeadershipBedTypeCountResponseDto {

	private BedTypeCountResponseDto totalBeds;
	private BedTypeCountResponseDto totalRooms;
	private BedTypeCountResponseDto areaBed;
	Map<Integer, BedTypeCountResponseDto> bedTypeMap;
	private List<BedTypeCountResponseDto> bedTypeCountList;
	private String reasonForNoPrima;
	private String reasonForNoMagna;
	private String reasonForNoSumma;
	private String propertyRemark;
}
