/**
 * 
 */
package com.stanzaliving.core.enums;

import java.util.HashMap;
import java.util.Map;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author naveen.kumar
 *
 * @date 24-Dec-2019
 *
 **/
@Getter
@AllArgsConstructor
public enum ResidenceType {

	STELLO("Student"),
	SUITS("Working Professional"),
	SCHOLAR("Student");

	private String targetUser;

	private static Map<String, ResidenceType> residenceTypeMap = new HashMap<>();

	static {

		for (ResidenceType residenceType : ResidenceType.values()) {
			residenceTypeMap.put(residenceType.getTargetUser(), residenceType);
		}

	}

	public static ResidenceType getResidentTypeForTargetUser(String targetUser) {
		return residenceTypeMap.get(targetUser);
	}
}