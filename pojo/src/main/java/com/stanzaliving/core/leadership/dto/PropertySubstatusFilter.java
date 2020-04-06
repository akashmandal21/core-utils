/**
 * 
 */
package com.stanzaliving.core.leadership.dto;

import com.stanzaliving.core.estate.enums.EstateStatus;

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
public class PropertySubstatusFilter {

	private boolean enabled;
	private EstateStatus propertySubStatus;
	private String propertySubStatusDesc;
	private int count;
}
