/**
 * @author nipunaggarwal
 *
 */
package com.stanzaliving.wanda.response;

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
public class ReferralCodeDetailDto extends ReferAndEarnBaseDto {

	private String referralCode;
	private String text;

}
