
package com.stanzaliving.vms.request.dto;

import java.util.List;

import javax.validation.constraints.NotBlank;

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
public class ResidenceVendorServicesMappingAddRequestDto {
	
	@NotBlank(message = "ResidenceId is mandatory")
	private String residenceId;
	
	List<ServiceProviderMappingListRequestDto> serviceProviderMappingListRequestDto;
	
}
