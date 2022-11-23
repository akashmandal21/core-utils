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
public enum LeadDropTypeEnum {

	NOT_APPLICABLE("Not Applicable"),
	PRE_VISIT_DROP("Pre visit drop"),
	POST_VISIT_DROP("Post visit drop");
	
	private String dropText;
}
