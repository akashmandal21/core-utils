/**
 * 
 */
package com.stanzaliving.core.food.dto.request;

import java.util.List;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import com.stanzaliving.core.base.common.dto.AbstractDto;
import com.stanzaliving.core.enums.ResidenceBrand;
import com.stanzaliving.core.food.enums.FoodItemBasePreference;
import com.stanzaliving.core.food.enums.FoodRegion;
import com.stanzaliving.core.food.enums.FoodServeType;
import com.stanzaliving.core.food.enums.GrammageHeavynessLevel;
import com.stanzaliving.core.food.enums.MenuCategoryType;
import com.stanzaliving.core.food.enums.MenuType;

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
public class FoodMenuCategoryMetadataDto extends AbstractDto {

	private String categoryId;

	@NotBlank(message = "City is Mandatory for Menu Category")
	private String cityId;

	@NotBlank(message = "microMarket is Mandatory for Menu Category")
	private String microMarketId;

	@NotBlank(message = "Name is Mandatory for Menu Category")
	private String categoryName;

	@NotNull(message = "Stanza Kitchen Flag is Mandatory")
	private Boolean stanzaKitchen;

	@NotNull(message = "Food Region Selection is Mandatory")
	private FoodRegion foodRegion;

	@NotNull(message = "Serve Type Selection is Mandatory")
	private FoodServeType foodServeType;

	private ResidenceBrand residenceBrand;

	@NotNull(message = "Menu Type Selection is mandatory")
	private MenuType menuType;

	private List<FoodItemBasePreference> basePreferences;

	private Double foodMargin;

	private Double utilityCost;

	private Double packagingCost;

	private Double transportCost;

	private Double incentiveCost;

	private Double serviceStaffCost;

	private boolean dataComplete;

	private boolean published;

	private String draftStatus;

	@NotNull(message = "Menu Category Type Selection is Mandatory")
	private MenuCategoryType categoryType;

	private GrammageHeavynessLevel grammageHeavynessLevel;

}