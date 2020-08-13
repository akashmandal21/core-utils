/**
 * @author nipunaggarwal
 *
 */
package com.stanzaliving.wanda.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author nipunaggarwal
 *
 */
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class EarningUIResponseDto {

	private String name;
	private String amount;
	private String payoutMode;
	private String referredDate;
	private String payoutDate;
	private String source;
	private String referredPaymentStatus;
	private String transactionId;

}
