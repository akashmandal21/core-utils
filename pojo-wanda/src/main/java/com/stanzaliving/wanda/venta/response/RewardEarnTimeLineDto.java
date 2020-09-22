/**
 * @author nipunaggarwal
 *
 */
package com.stanzaliving.wanda.venta.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author nipunaggarwal
 *
 */
@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class RewardEarnTimeLineDto {

	private TotalEarnedResponseDto totalEarnedResponseDto;
    private AmountReceivedDto amountReceivedDto;
    
}
