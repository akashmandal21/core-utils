/**
 * @author nipunaggarwal
 *
 */
package com.stanzaliving.wanda.dtos;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.stanzaliving.wanda.response.ReferralCodeDetailDto;
import com.stanzaliving.wanda.response.ReferralEarningResponseDto;
import com.stanzaliving.wanda.response.ReferralLevelResponseDto;
import com.stanzaliving.wanda.venta.response.ReferralStatusCountResponseDto;

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

	@JsonProperty("How It Works")
	private List<HowItWorksDetailDto> howItWorks;

	@JsonProperty("Unlock Levels & Earn More")
	private List<ReferralLevelResponseDto> referralLevels;

	@JsonProperty("Refer And Earn Rewards!")
	private ReferralCodeDetailDto referralCode;

	@JsonProperty("Your Referrals")
	private List<ReferralStatusCountResponseDto> referralCounts;

	@JsonProperty("Your Earnings")
	private ReferralEarningResponseDto referralEarnings;

}
