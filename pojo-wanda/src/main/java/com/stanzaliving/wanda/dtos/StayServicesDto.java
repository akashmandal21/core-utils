/**
 * @author nipunaggarwal
 *
 */
package com.stanzaliving.wanda.dtos;

import java.util.List;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

/**
 * @author nipunaggarwal
 *
 */
@SuperBuilder
@Getter
@Setter
@ToString(callSuper = true)
public class StayServicesDto {

	private String packagedServicesText;
	private List<StayServicesDetailDto> packagedServices;
	private String valueAddedServicesText;
	private List<StayServicesDetailDto> valueAddedServices;

}
