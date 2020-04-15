/**
 * 
 */
package com.stanzaliving.core.food.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author naveen.kumar
 *
 * @date 15-Apr-2020
 *
 **/
@Getter
@AllArgsConstructor
public enum FoodRegion {

	NORTH("North Indian"),
	SOUTH("South Indian");

	private String regionName;
}