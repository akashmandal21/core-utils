/**
 * 
 */
package com.stanzaliving.transformations.pojo;

import com.stanzaliving.transformations.enums.LineItemStatus;
import com.stanzaliving.transformations.enums.LineItemType;

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
public class LineItemStatusRequestDto {

	private String lineItemUuid;
	private LineItemStatus status;
	private LineItemType lineItemType;
}
