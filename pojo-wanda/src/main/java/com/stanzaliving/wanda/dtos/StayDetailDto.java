/**
 * @author nipunaggarwal
 *
 */
package com.stanzaliving.wanda.dtos;

import com.stanzaliving.wanda.venta.response.ResidenceServicesDetailsDto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * @author nipunaggarwal
 *
 */
@Getter
@Setter
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class StayDetailDto {

	private StayResidenceDto residenceDetails;
	private StayDuesDto dueDetails;
	private ResidenceServicesDetailsDto serviceDetails;

}
