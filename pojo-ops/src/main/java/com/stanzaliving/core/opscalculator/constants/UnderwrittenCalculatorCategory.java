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
	INTERNET("internet"),
	LAUNDRY("laundry"),
	OE("oe"),
	PERSONNEL("personnel"),
	RC("rc"),
	REPAIR("repair"),
	BUILDING("building"),
	SECURITY("security"),
	SUBSCRIPTION("subscription"),
	TRANSPORT("transport"),
	UNIFORM_COSTS("uniform_costs"),
	UTILITIES("utilities"),
	UNDER_WRITTEN("underWritten"),
	WATER("water");

	private String underwrittenCalculatorCategory;
}
