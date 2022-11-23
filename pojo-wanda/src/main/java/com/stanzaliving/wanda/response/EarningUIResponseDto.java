/**
 * @author nipunaggarwal
 *
 */
package com.stanzaliving.wanda.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import java.util.LinkedHashMap;

/**
 * @author nipunaggarwal
 *
 */
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
@Getter
@Setter
public abstract class EarningUIResponseDto {

	private String name;
	private String amount;
	private String payoutMode;
	private String referredAt;
	private String payoutDate;
	private String createdAt;
	private String source;
	private String referredPaymentStatus;
	private String transactionId;
	private LinkedHashMap<String, String> amountBreakUp;

}
