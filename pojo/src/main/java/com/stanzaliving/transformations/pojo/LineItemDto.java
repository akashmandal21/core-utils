/**
 * 
 */
package com.stanzaliving.transformations.pojo;

import com.stanzaliving.transformations.enums.AreaOfUse;

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
public class LineItemDto {

	private String lineItemUuid;
	private String particular;
	private String specifications;
	private String type;
	private String itemCode;
	private String unitType;
	private Integer slQty ;
	private Integer llQty;
	private Integer gcQty;
	private String image;
	private float length;
	private float breadth;
	private AreaOfUse areaOfUse;
	private String brandName;
	private String subBrandName;
	
}
