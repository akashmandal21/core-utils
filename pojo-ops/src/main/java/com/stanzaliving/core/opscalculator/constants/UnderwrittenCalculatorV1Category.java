/**
 * @author nipunaggarwal
 *
 */
package com.stanzaliving.core.opscalculator.constants;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author manish.pareek
 *
 */
@Getter
@AllArgsConstructor
public enum UnderwrittenCalculatorV1Category {

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
	INCENTIVE("uniform"),
	CX("cx"),
	TRANSPORT("transport");

	private String categoryName;
}
