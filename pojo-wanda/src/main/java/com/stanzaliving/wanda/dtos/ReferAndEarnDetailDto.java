/**
 * @author nipunaggarwal
 *
 */
package com.stanzaliving.wanda.dtos;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.stanzaliving.wanda.response.KycUIResponseDto;
import com.stanzaliving.wanda.response.ReferFriendsNowUIResponseDto;
import com.stanzaliving.wanda.response.ReferralCodeDetailDto;
import com.stanzaliving.wanda.response.ReferralEarningResponseDto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
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
@AllArgsConstructor
@NoArgsConstructor
@ToString(callSuper = true)
@JsonIgnoreProperties({ "sequenceId" })
public class ReferAndEarnDetailDto extends ReferAndEarnBaseDto {

	private int showTdsBox;
	private HowItWorksDto howItWorks;
	private UnlockLevelsAndEarnMoreDto unlockLevelsAndEarnMore;
	private ReferralCodeDetailDto referralCode;
	private YourReferralsDto yourReferrals;
	private ReferralEarningResponseDto yourEarnings;
	private KycUIResponseDto kycAndPaymentDetails;
	private ReferFriendsNowUIResponseDto referFriendsNow;

}
