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
public class EarningResponseDto {

	private String name;
	private Double amount;
	private String payoutMode;
	private String referredDate;
	private String payoutDate;
	private String source;
	private String transactionId;

}
