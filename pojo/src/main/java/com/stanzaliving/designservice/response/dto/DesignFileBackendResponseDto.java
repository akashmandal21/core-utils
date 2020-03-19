/**
 * 
 */
package com.stanzaliving.designservice.response.dto;

import java.util.List;

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
public class DesignFileBackendResponseDto {

	private String designFilePath;
	private String designFileUuid;
	private String designFileName;
	private String designFileExtension;
	private List<Integer> floors;
	private int floorCount;
	private List<BedTypeRoomDistribution> bedTypes;
}
