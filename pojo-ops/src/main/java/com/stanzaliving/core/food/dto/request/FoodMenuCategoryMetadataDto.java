/**
 * 
 */
package com.stanzaliving.core.food.dto.request;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import com.stanzaliving.core.enums.ResidenceBrand;
import com.stanzaliving.core.food.enums.FoodRegion;
import com.stanzaliving.core.food.enums.FoodServeType;
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
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class FoodMenuCategoryMetadataDto {

	private String categoryId;

	@NotBlank(message = "City is Mandatory for Menu Category")
	private String cityId;

	@NotBlank(message = "Name is Mandatory for Menu Category")
	private String categoryName;

	@NotNull(message = "Stanza Kitchen Flag is Mandatory")
	private Boolean stanzaKitchen;

	@NotNull(message = "Food Region Selection is Mandatory")
	private FoodRegion foodRegion;

	@NotNull(message = "Serve Type Selection is Mandatory")
	private FoodServeType foodServeType;

	@NotNull(message = "Brand Selection is Mandatory")
	private ResidenceBrand residenceBrand;

}