/**
 * @author nipunaggarwal
 *
 */
package com.stanzaliving.wanda.dtos;

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
public class StayCommercialsContractDto {

	private MonthlyFee monthlyFee;
	private ContractDetailsDto contractDetails;
	ContractRenewalBannerDto contractRenewalBannerDto;
}
