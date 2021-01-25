/**
 * 
 */
package com.stanzaliving.transformations.pojo;

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
public class LineItemUIRequestDto {

	private String propertyUuid;
	private String categoryUuid;
	private String lineItemUuid;
	private Integer slQty;
	private Integer llQty;
	private Integer gcQty;
	private String areaOfUse;
	private LineItemType lineItemType;
}
