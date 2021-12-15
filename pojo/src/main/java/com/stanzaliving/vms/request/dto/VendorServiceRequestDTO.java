
package com.stanzaliving.vms.request.dto;

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
public class VendorServiceRequestDTO {
		
	@NonNull
	private String serviceName;
	
	@Builder.Default
	private boolean status = true;
}
