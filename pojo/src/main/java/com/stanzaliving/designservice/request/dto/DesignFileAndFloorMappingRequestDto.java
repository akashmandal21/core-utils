/**
 * 
 */
package com.stanzaliving.designservice.request.dto;

import java.util.List;

import lombok.ToString;
import lombok.Setter;
import lombok.Getter;

/**
 * @author raj.kumar
 *
 */
@Getter
@Setter
@ToString
public class DesignFileAndFloorMappingRequestDto {

	private String estateUuid;
	private List<DesignFloorMappingDto> designFloorMappingList;
}
