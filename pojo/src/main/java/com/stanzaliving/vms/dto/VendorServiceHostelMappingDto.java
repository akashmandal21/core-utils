
package com.stanzaliving.vms.dto;

import com.stanzaliving.core.base.common.dto.AbstractDto;

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
public class VendorServiceHostelMappingDto extends AbstractDto  {
	
	private static final long serialVersionUID = -2433102101907102217L;

	private String vendorServiceId;
		
	private String hostelId;

	private String hostelName;
}
