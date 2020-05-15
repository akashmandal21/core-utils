/**
 * 
 */
package com.stanzaliving.core.user.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author naveen
 *
 * @date 09-Oct-2019
 */
@Getter
@AllArgsConstructor
public enum Gender {

	MALE("Male"),
	FEMALE("Female"),
	OTHERS("Others");

	private String genderName;
}