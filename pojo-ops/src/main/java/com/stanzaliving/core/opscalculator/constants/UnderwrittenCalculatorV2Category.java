
package com.stanzaliving.core.opscalculator.constants;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author manish.pareek
 *
 */
@Getter
@AllArgsConstructor
public enum UnderwrittenCalculatorV2Category {

	FOOD("food"),
	PERSONNEL("personnel"),
	ELECTRICITY("electricity"),
	WATER("water"),
	DG("dg"),
	SUPPLIES("supplies"),
	INTERNET("internet"),
	LAUNDRY("laundry"),
	REPAIR("repair"),
	BUILDING("building"),
	AUDIT("audit"),
	UNIFORM("uniform"),
	INCENTIVE("incentive"),
	CX("cx"),
	TRANSPORT("transport"),
	UNDER_WRITTEN("underWritten");

	private String underwrittenCalculatorCategory;
}
