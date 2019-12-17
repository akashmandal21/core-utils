/**
 * 
 */
package com.stanzaliving.transformations.pojo;

import java.util.List;
import java.util.Map;

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
public class BoiGcItemQuantityRequestDto {

	private String propertyId;
	List<CategoryLineItemRequestDto> boiLineItems;
	List<CategoryLineItemRequestDto> gcLineItems;
}
