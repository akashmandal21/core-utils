/**
 * 
 */
package com.stanzaliving.core.food.dto;

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
 * @date 18-Apr-2020
 *
 **/
@Getter
@Setter
@ToString(callSuper = true)
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class TagDto extends AbstractDto {

	private String tagName;

	private FoodItemType tagType;

	private String tagTypeName;

	private Boolean serviceMixEnabled;
	
}