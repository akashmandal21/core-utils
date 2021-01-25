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
public enum FoodUserType {

	RESIDENT("Resident"),
	STANZA_STAFF("Stanza Staff"),
	NON_STANZA_STAFF("Non-Stanza Staff");

	private String typeName;
}