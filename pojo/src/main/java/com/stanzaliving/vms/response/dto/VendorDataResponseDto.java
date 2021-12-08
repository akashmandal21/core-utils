
package com.stanzaliving.vms.response.dto;

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
public class VendorDataResponseDto {
	
	private String vendorId;
	private String vendorName;
	private String hostelId;
	private String hostelName;
	
	private String vendorServiceId;
	private String serviceName;
	

	
}
