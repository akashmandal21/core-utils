/**
 * @author nipunaggarwal
 *
 */
package com.stanzaliving.wanda.dtos;

import java.util.List;

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
public class YourReferralsDto {
	
	private Integer sequenceId;
	private String title;
	private List<ReferralStatusCountResponseDto> referralCounts;

}
