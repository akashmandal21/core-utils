/**
 * 
 */
package com.stanzaliving.transformations.enums;

import lombok.Getter;

/**
 * @author raj.kumar
 *
 */
@Getter
public enum AreaOfUse {

	ROOM("Room"),
	RECEPTION("Reception"),
	ENTERTAINMENT("Entertainment"),
	BACK_OF_HOUSE("Back of House"),
	GAMING("Gaming"),
	CAFE_AREA("Cafe Area"),
	BRANDING("Branding"),
	GYM("Gym");
	
	private String name;

	private AreaOfUse(String name) {
		this.name = name;
	}
}
