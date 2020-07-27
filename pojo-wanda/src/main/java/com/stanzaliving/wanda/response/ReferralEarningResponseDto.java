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

	private String rewardsEarned;
	private String rewardsEarnedImgUrl;
	private String amountReceived;
	private String amountReceivedImgUrl;
}
