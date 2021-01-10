/**
 * 
 */
package com.stanzaliving.core.food.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author naveen.kumar
 *
 * @date 10-May-2020
 *
 **/
@Getter
@AllArgsConstructor
public enum FoodOrderImageType {

	PLATES("Plates"),
	BAIN_MARIE("Bain Marie"),
	DINING_AREA("Dining Area");

	private String imageTypeName;
}