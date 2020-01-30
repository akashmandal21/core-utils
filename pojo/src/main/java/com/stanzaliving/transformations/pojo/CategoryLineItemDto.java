/**
 * 
 */
package com.stanzaliving.transformations.pojo;

import java.util.List;

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
@NoArgsConstructor
@AllArgsConstructor
public class CategoryLineItemDto {

	private String categoryUuid;
	private String categoryName;
	private List<LineItemDto> lineItemList;
	
	public CategoryLineItemDto(String categoryName, String categoryUuid) {
		this.categoryUuid = categoryUuid;
		this.categoryName = categoryName;
	}
}
