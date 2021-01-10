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
public enum LeadQualifiedEnum {

	QUALIFIED("Qualified"),
	YET_TO_QUALIFY("Yet to qualify"),
	DISQUALIFIED("Disqualified");
	
	private String leadSourceName;
}
