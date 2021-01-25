/**
 * 
 */
package com.stanzaliving.core.food.dto;

import com.stanzaliving.core.food.enums.FoodItemBasePreference;
import com.stanzaliving.core.food.enums.FoodItemType;
import com.stanzaliving.core.food.enums.FoodRegion;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;
import java.util.List;

/**
 * @author raj.kumar
 *
 */
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class FoodQrItemDto {

	private int quantity;
	private double cost;
	private String houseName;
	private String mealType;
	private String mealImg;
	private String foodItemType;
	private String displayName;
	private FoodItemBasePreference foodItemBasePreference;
	private FoodRegion foodRegion;
	private FoodItemType foodPreference;
	private String residenceFoodMenuId;
	private String foodText;
	private List<String> foodItemNames;
	private boolean isMealReplacement;
	private boolean incorrectQr;
	private String scannedCombo;
	private Date scannedTime;
	private String requestedCombo;
	private boolean pickMealDisable;
	private boolean baseCombo;
}
