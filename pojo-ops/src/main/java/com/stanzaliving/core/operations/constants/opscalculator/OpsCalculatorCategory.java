/**
 * @author nipunaggarwal
 *
 */
package com.stanzaliving.core.operations.constants.opscalculator;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author nipunaggarwal
 *
 */
@Getter
@AllArgsConstructor
public enum OpsCalculatorCategory {

	AUDIT("audit"),
	DG("dg"),
	ELECTRICITY("electricity"),
	EQUIPMENT("equipment"),
	FOOD("food"),
	HK("hk"),
	INTERN("intern"),
	LAUNDRY("laundry"),
	REPAIR("repair"),
	SECURITY("security"),
	SUBSCRIPTION("subscription"),
	WATER("water");

	private String opsCalculatorCategory;
}
