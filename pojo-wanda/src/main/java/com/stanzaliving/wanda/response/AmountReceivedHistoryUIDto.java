/**
 * @author nipunaggarwal
 *
 */
package com.stanzaliving.wanda.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

/**
 * @author nipunaggarwal
 *
 */
@Getter
@Setter
@SuperBuilder
@ToString(callSuper = true)
@JsonIgnoreProperties({ "payoutDate", "source", "payoutMode", "referredPaymentStatus" })
public class AmountReceivedHistoryUIDto extends EarningUIResponseDto {

	private String paymentDetails;

}
