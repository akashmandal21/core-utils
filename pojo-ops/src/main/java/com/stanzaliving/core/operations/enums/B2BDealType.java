/**
 * 
 */
package com.stanzaliving.core.operations.enums;
import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author naveen
 *
 * @date 05-Feb-2021
 */
@Getter
@AllArgsConstructor
public enum B2BDealType {

	FOOD("Food Only"),
	OPS("OPS Only"),
	FOODOPS("Food and OPS");

	public String dealName;

}