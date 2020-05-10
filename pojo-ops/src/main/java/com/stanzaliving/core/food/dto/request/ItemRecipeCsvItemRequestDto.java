/**
 * @author nipunaggarwal
 *
 */
package com.stanzaliving.core.food.dto.request;

import java.util.Collection;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

/**
 * @author nipunaggarwal
 *
 */
@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class ItemRecipeCsvItemRequestDto {

	private String itemId;
	private String itemName;
	private String quantity;
	private Collection<ItemRecipeCsvIngredientRequestDto> ingredients;

}
