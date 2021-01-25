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
public class DesignFileFloorMappingDto {

	private String estateUuid;
	private Map<String, List<Integer>> desingFileFloorMapping;
}
