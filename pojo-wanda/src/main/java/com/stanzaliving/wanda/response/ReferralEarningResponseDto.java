/**
 * @author nipunaggarwal
 *
 */
package com.stanzaliving.wanda.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.stanzaliving.wanda.dtos.ReferAndEarnBaseDto;

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
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
@Getter
@Setter
@ToString(callSuper = true)
@JsonIgnoreProperties({ "imgUrl", "text" })
public class ReferralEarningResponseDto extends ReferAndEarnBaseDto{

	private int showTdsBox;
	private TotalEarnedUIResponseDto rewardsEarnedHistory;
	private AmountReceivedUIDto amountReceivedHistory;

}
