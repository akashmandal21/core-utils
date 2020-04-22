/**
 * 
 */
package com.stanzaliving.core.food.dto;

import java.util.List;

import com.stanzaliving.core.base.common.dto.AbstractDto;
import com.stanzaliving.core.food.enums.FoodItemType;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

/**
 * @author naveen.kumar
 *
 * @date 21-Apr-2020
 *
 **/
@Getter
@Setter
@ToString(callSuper = true)
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class FoodItemDto extends AbstractDto {

	private String name;

	private FoodItemType itemType;

	private String itemTypeName;

	private String defaultBrandId;

	private String defaultBrandName;

	private boolean quantifiable;

	private String textColor;

	private String bgColor;
	
	private String categoryId;
	
	private String categoryName;

	private List<TagDto> tagDtos;
}