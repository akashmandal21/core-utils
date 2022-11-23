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
public class StayServicesDtoV2 {

	private String packagedServicesText;
	private List<PackagedServicesDtoV2> packagedServices;
	private String valueAddedServicesText;
	private List<VasServicesDtoV2> valueAddedServices;

}
