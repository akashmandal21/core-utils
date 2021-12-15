
package com.stanzaliving.vms.request.dto;

import javax.validation.constraints.NotBlank;

import com.stanzaliving.vms.enums.ProviderMappingStatus;
import com.stanzaliving.vms.enums.ServiceProviderMappingAction;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
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
public class ServiceProviderMappingListRequestDto {
	
	@NotBlank(message = "ServiceId is mandatory")
	private String serviceId;
	
	@NotBlank(message = "ServiceProviderId is mandatory")
	private String serviceProviderId;
	
	@NonNull
	private ProviderMappingStatus providerMappingStatus; 
	
	@NonNull
	private ServiceProviderMappingAction serviceProviderMappingAction;
}
