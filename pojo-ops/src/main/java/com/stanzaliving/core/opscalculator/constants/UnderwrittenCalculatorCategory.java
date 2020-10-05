/**
 * @author nipunaggarwal
 *
 */
package com.stanzaliving.core.opscalculator.constants;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author nipunaggarwal
 *
 */
@Getter
@AllArgsConstructor
public enum UnderwrittenCalculatorCategory {

	AUDIT("audit"),
	DG("dg"),
	ELECTRICITY("electricity"),
	EQUIPMENT("equipment"),
	FOOD("food"),
	HK("hk"),
	LAUNDRY("laundry"),
	OE("oe"),
	RC("rc"),
	REPAIR("repair"),
	SECURITY("security"),
	SUBSCRIPTION("subscription"),
	UNIFORM_COSTS("uniform_costs"),
	WATER("water"),
	INTERNET("internet"),
	UTILITIES("utilities"),
	PERSONNEL("personnel"),
	TRANSPORT("transport"),
	UNDER_WRITTEN("underWritten");

	private String underwrittenCalculatorCategory;
}
