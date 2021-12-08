
package com.stanzaliving.vms.request.dto;

import java.util.List;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

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
public class VendorServiceHostelMappingRequestDTO {
	
	@NotBlank(message = "VendorServiceId is mandatory")
	private String vendorServiceId;
	
	@NotNull(message = "HostelIds is mandatory")
	private List<String> hostelIds;
	
}
