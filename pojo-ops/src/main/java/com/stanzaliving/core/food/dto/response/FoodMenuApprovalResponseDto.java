/**
 * 
 */
package com.stanzaliving.core.food.dto.response;

import lombok.Setter;
import lombok.ToString;

import com.stanzaliving.core.base.enums.AccessLevel;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * @author naveen.kumar
 *
 * @date 06-May-2020
 *
 **/
@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class FoodMenuApprovalResponseDto {

	private AccessLevel accessLevel;

	private String menuGroupId;

	private String cityId;

	private String cityName;

	private String microMarketId;

	private String microMarketName;

	private String menuCategoryId;

	private String menuCategoryName;

	private boolean stanzaKitchenCategory;

	private int nonCentralApprovedMenus;

	private int nonVendorApprovedMenus;

	private int fpsScore;

	private boolean fpsScorePassed;

	private boolean newnessAdherence;

	private int mealsWithRatingLessThanFour;

	private int currentWeekBudget;

	private int currentWeekBudgetDeviation;

	private int mtdBudget;

	private int mtdBudgetDeviation;
}