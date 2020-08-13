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
public class ReferralEarningResponseDto {

	private TotalEarnedUIResponseDto totalEarnedUIResponseDto;
	private AmountReceivedUIDto amountReceivedUIDto;

}
