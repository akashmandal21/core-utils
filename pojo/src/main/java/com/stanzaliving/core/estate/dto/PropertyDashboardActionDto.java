/**
 * 
 */
package com.stanzaliving.core.estate.dto;

import com.stanzaliving.core.estate.enums.EstateStatus;
import com.stanzaliving.core.estate.enums.PropertyAction;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author raj.kumar
 *
 */
@Getter
@Setter
@ToString
public class PropertyDashboardActionDto {

	private String uuid;
	private String estateUuid;
	private PropertyAction requestAction;
	private EstateStatus estateStatus;
	private String reason;
}
