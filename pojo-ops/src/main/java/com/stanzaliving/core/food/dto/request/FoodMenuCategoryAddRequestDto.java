/**
 * 
 */
package com.stanzaliving.core.food.dto.request;

import java.util.Set;

import javax.validation.constraints.NotBlank;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

/**
 * @author naveen.kumar
 *
 * @date 22-Apr-2020
 *
 **/
@Getter
@Setter
@ToString(callSuper = true)
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class FoodMenuCategoryAddRequestDto {

	@NotBlank(message = "Micromarket is Mandatory for Menu Category")
	private String microMarketId;

	@NotBlank(message = "Name is Mandatory for Menu Category")
	private String categoryName;

	private Set<String> residences;
}