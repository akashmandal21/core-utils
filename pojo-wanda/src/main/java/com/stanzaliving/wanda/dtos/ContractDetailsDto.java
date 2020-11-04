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

/**
 * @author nipunaggarwal
 *
 */
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ContractDetailsDto {

	private String contractPeriod;
	private String lockInPeriod;
	private String lockInPeriodText;
	private String monthlyFee;
	private String vasPerMonth;
	private String securityDeposit;
	private String advanceFee;
	private String maintenanceFee;
	private String contractEndDate;
	private String contractPeriodText;
	private String maintenanceModalTitle;

}
