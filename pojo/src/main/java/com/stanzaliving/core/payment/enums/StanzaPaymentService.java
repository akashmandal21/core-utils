/**
 * 
 */
package com.stanzaliving.core.payment.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author naveen.kumar
 *
 * @date 16 Sep, 2020
 *
 **/
@Getter
@AllArgsConstructor
public enum StanzaPaymentService {

	FOOD("Food"),
	IMS("Venta"),
	WEBSITE("Website"),
	ALFRED("Alfred"),
	CAFE("Cafe"),
	FOOD_SUBSCRIPTION("Food Subscription"),
	PREPAID_METER("Prepaid Meter"),
	SUBSCRIPTION_PLAN("Subscription Plan")
	;

	private String displayName;
}