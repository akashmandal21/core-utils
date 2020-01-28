/**
 * 
 */
package com.stanzaliving.transformations.pojo;

import com.stanzaliving.transformations.enums.AreaOfUse;
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
public class LineItemDeleteRequestDto {

	private String categoryUuid;
	private String lineItemUuid;
	private Integer slQty;
	private Integer llQty;
	private Integer gcQty;
	private AreaOfUse areaOfUse;
	private LineItemType lineItemType;
}
