/**
 * 
 */
package com.stanzaliving.core.food.dto;

import java.util.List;

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
@ToString(callSuper = true)
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class FoodMenuCategoryDto extends AbstractDto {

	private String categoryName;

	private String cityId;

	private String cityName;

	private String microMarketId;

	private String microMarketName;

	private List<ResidenceConfigDto> residences;

	private boolean menuRulesSatisfied;

	private boolean stanzaKitchenCategory;

	private List<ResidenceConfigDto> mappedResidences;

	private ResidenceBrand residenceBrand;

	private FoodRegion foodRegion;

	private FoodServeType foodServeType;

	private Double foodMargin;

	private MenuType menuType;

	private boolean dataComplete;

	private List<FoodItemBasePreference> basePreferences;

	private MenuCategoryType categoryType;

	private GrammageHeavynessLevel grammageHeavynessLevel;

	private String menuCopiedMsg;
}