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
public class AmountReceivedUIDto {

	private String amountReceived;
	private String amountReceivedImgUrl;
	private List<EarningUIResponseDto> earningUIResponseDtos;

}
