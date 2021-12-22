/**
 * 
 */
package com.stanzaliving.core.estate.dto;

import com.stanzaliving.core.estate.enums.EstateStatus;
import com.stanzaliving.core.estate.enums.PropertyAction;

import lombok.*;

import java.util.Date;

/**
 * @author raj.kumar
 *
 */
@Getter
@Setter
@ToString
public class PropertyActionRequestDto {

	private String reason;
	private String estateUuid;
	private EstateStatus estateStatus; //This attribute set internally
	private PropertyAction propertyAction;	
	private String propertyName;
	private Date droppedDate;
}
