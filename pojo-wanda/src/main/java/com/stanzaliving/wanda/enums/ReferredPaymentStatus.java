/**
 * @author nipunaggarwal
 *
 */
package com.stanzaliving.wanda.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author nipunaggarwal
 *
 */
@Getter
@AllArgsConstructor
public enum ReferredPaymentStatus {

	AMOUNT_PAID("Amount Paid"),
	PROCESSING_AMOUNT("Processing Amount");

	String name;

}
