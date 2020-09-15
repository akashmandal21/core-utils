/**
 * @author nipunaggarwal
 *
 */
package com.stanzaliving.wanda.venta.response;

import java.util.List;

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
public class TotalEarnedResponseDto {

	private Double totalEarned;
    private List<EarningResponseDto> rewardEarnTimeLineDtoList;
    
}
