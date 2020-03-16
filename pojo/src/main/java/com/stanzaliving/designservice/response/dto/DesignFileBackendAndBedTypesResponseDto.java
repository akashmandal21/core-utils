/**
 * 
 */
package com.stanzaliving.designservice.response.dto;

import java.util.List;
import java.util.Set;

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
public class DesignFileBackendAndBedTypesResponseDto {

	private List<DesignFileBackendResponseDto> designFileBackendResponse;
	private List<BedTypeAndStatusResponseDto> bedTypeAndStatus;
	
}
