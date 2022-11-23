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
public class StayCommercialDuesDto {

	private String dueDate;
	private String previousArrears;
	private String duesOfCurrentMonth;
	private String paidThisMonth;
	private String currentDues;
	private String totalPaid;
	private String month;
	private String nextBillingDate;
}
