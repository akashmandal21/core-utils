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
@NoArgsConstructor
@AllArgsConstructor
public class ReferralStatusCountResponseDto {

	private String status;
    private Integer count;
    private String color;
	
}
