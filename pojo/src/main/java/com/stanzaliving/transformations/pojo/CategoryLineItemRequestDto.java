/**
 * 
 */
package com.stanzaliving.transformations.pojo;

import java.util.List;

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
public class CategoryLineItemRequestDto {

	private String categoryUuid;
	private String categoryName;
	private List<LineItemRequestDto> lineItemList;
}
