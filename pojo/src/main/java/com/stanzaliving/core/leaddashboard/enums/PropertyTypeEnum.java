/**
 * 
 */
package com.stanzaliving.core.leaddashboard.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author raj.kumar
 *
 */
@Getter
@AllArgsConstructor
public enum PropertyTypeEnum {

	//Added for reporting, to show leads whose residence type is null
	NOT_APPLICABLE("Not Applicable"),
	SUITS("Suits"),
	SCHOLAR("Scholar");
	
	private String propertyTypeText;
}
