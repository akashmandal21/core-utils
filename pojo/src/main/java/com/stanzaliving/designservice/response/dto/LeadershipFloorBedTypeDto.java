/**
 * 
 */
package com.stanzaliving.designservice.response.dto;

import java.util.List;
import java.util.Map;

import com.stanzaliving.designservice.enums.BedType;

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
public class LeadershipFloorBedTypeDto {

	private List<Integer> floors;
	private List<BedTypeImagePathDto> bedTypeImagePathList;
	private Map<BedType, BedTypeImagePathDto> leadershipBedTypeMap;
}
