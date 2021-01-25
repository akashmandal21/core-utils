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
public class AddLineItemResponseDto {

	private String categoryUuid;
	private String categoryName;
	private String particular;
	private String specifications;
	private String rateType;
	private Integer slQty;
	private Integer llQty;
	private String unit;
	private Integer gcQty;
	
}
