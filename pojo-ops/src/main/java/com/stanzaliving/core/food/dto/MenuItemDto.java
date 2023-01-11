/**
 * 
 */
package com.stanzaliving.core.food.dto;

import java.io.Serializable;
import java.util.List;

import com.stanzaliving.core.base.common.dto.ListingDto;
import com.stanzaliving.core.food.dto.response.CuisineTagsDto;
import com.stanzaliving.core.food.enums.Action;
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
 * @date 23-Apr-2020
 *
 **/
@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class MenuItemDto implements Serializable {

	private String itemId;

	private String itemName;

	private boolean additive;

	private String categoryId;

	private ListingDto category;

	private ListingDto subCategory;

	private FoodItemType itemType;

	private String itemTypeName;

	private Double itemGrammage;

	private Integer itemQty;

	private boolean quantifiable;

	private String textColor;

	private String bgColor;

	private Float rating;

	private Double cost;

	private boolean newlyAdded;

	private boolean stapleDish;

	private List<ListingDto> tagsList;

	private Action action;

	private boolean isDebarred;

	private CuisineTagsDto l1AndL2CuisineTagsDto;

}