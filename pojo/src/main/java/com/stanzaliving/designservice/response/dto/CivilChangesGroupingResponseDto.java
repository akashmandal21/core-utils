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
public class CivilChangesGroupingResponseDto {

	private String estateUuid;
	List<CivilChangesAttributes> newCivilChanges;
	List<CivilChangesAttributes> oldCivilChanges;
}
