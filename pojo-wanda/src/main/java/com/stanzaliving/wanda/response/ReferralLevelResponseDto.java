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
public class ReferralLevelResponseDto {

	private String level;
	private String criteria;
	private String reward;
	@Builder.Default
	private Boolean currentLevel = Boolean.FALSE;

}
