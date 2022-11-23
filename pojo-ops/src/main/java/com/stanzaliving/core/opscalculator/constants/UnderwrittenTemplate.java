package com.stanzaliving.core.opscalculator.constants;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author manish.pareek
 *
 */
@Getter
@AllArgsConstructor
public enum UnderwrittenTemplate {

	TEMPLATE1("TEMPLATE1"),
	TEMPLATE2("TEMPLATE2"),
	TEMPLATE3("TEMPLATE3");

	private String underwrittenTemplateCategory;
}
