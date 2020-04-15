/**
 * 
 */
package com.stanzaliving.designservice.request.dto;

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
public class AssignEstateBedTypeRequestDto {

	private String estateUuid;
	private String designFileUuid;
	List<BedTypeDistributionRequest> bedTypeDistributionRequest;
}
