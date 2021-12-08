
package com.stanzaliving.vms.request.dto;

import javax.validation.constraints.NotBlank;

import com.stanzaliving.vms.enums.ServiceType;

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
public class VendorServiceAddRequestDTO {
	
	@NotBlank(message = "VendorId is mandatory")
	private String vendorId;
	
	@NonNull
	private ServiceType serviceType;
}
