/**
 * 
 */
package com.stanzaliving.core.food.dto.request;

import javax.validation.constraints.NotBlank;

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
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class TagRequestDto {

	@NotBlank(message = "Tag Name Cannot be blank")
	private String tagName;

	@NotBlank(message = "Tag Type is mandatory")
	private FoodItemType tagType;
}