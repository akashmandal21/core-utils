/**
 * 
 */
package com.stanzaliving.core.operations.enums;
import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author manish.pareek
 *
 * @date 05-Feb-2021
 */
@Getter
@AllArgsConstructor
public enum DealCategory {

	B2B("B2B Deal"),
	B2C("B2C Deal");
	
	private String dealCategoryName;

}

