/**
 * @author nipunaggarwal
 *
 */
package com.stanzaliving.wanda.response;

import java.util.List;

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
public class TotalEarnedUIResponseDto {

	private String totalEarned;
	private String rewardsEarnedImgUrl;
	private List<EarningUIResponseDto> earningUIResponseDto;

}
