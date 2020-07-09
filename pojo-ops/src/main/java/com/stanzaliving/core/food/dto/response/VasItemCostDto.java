/**
 * 
 */
package com.stanzaliving.core.food.dto.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * @author raj.kumar
 *
 */
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class VasItemCostDto {

	private Double cost;
	private Double gst;
	private String itemId;
	private int itemQuantity;
	private int itemWeight;
}
