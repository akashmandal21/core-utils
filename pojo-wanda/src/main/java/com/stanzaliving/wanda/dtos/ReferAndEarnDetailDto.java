/**
 * @author nipunaggarwal
 *
 */
package com.stanzaliving.wanda.dtos;

import com.stanzaliving.wanda.response.ReferralCodeDetailDto;
import com.stanzaliving.wanda.response.ReferralEarningResponseDto;

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
@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ReferAndEarnDetailDto {

	private HowItWorksDto howItWorks;
	private UnlockLevelsAndEarnMoreDto unlockLevelsAndEarnMore;
	private ReferralCodeDetailDto referralCode;
	private YourReferralsDto yourReferrals;
	private ReferralEarningResponseDto yourEarnings;

}
