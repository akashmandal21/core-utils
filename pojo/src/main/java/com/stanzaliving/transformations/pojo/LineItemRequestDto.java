/**
 * 
 */
package com.stanzaliving.transformations.pojo;

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
public class LineItemRequestDto {

	private String lineItemUuid;
	private Integer slQty;
	private Integer llQty;
	private Integer gcQty;
	private String areaOfUse;
}
