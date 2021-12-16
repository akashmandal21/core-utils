
package com.stanzaliving.vms.dto;

import com.stanzaliving.core.base.common.dto.AbstractDto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

/**
 * @author manish.pareek
 * @date 02/12/21
 */

@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
public class ResidenceVendorServicesMappingDto extends AbstractDto  {

	private static final long serialVersionUID = -2433102101907102217L;

	private String residenceId;

	private String residenceName;

	private String vendorId;

	private String vendorName;

	private String serviceId;

	private String serviceName;

	private String cityId;

	private String cityName;

	private String micromarketId;

	private String micromarketName;
	

	
}
