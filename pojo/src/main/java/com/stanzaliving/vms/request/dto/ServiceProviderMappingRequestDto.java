
package com.stanzaliving.vms.request.dto;

import javax.validation.constraints.Min;

import com.stanzaliving.common.constant.SortingType;
import com.stanzaliving.vms.enums.ServiceProviderMappingSortingField;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author manish.pareek
 * @date 02/12/21
 */
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ServiceProviderMappingRequestDto {
	
	@Builder.Default
	@Min(value = 1, message = "Page no cannot be less than 1")
	private int pageNo = 1;
	@Builder.Default
	@Min(value = 1, message = "Limit cannot be be less than 1")
	private int limit = 50;
	

	private String cityId;
	private String microMarketId;
	private String residenceId;
	private String serviceProvided;
	private Boolean serviceStatus;

	private SortingType sortingType;
	private ServiceProviderMappingSortingField sortingField;

}
