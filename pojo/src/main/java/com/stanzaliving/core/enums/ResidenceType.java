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

	STELLO("Student", 1),
	SUITS("Working Professional", 0);

	private String targetUser;
	private int ventaResidenceTypeOrdinal;

	private static Map<String, ResidenceType> residenceTypeMap = new HashMap<>();

	private static Map<Integer, ResidenceType> ventaResidenceTypeMap = new HashMap<>();

	static {

		for (ResidenceType residenceType : ResidenceType.values()) {
			residenceTypeMap.put(residenceType.getTargetUser(), residenceType);
			ventaResidenceTypeMap.put(residenceType.getVentaResidenceTypeOrdinal(), residenceType);
		}

	}

	public static ResidenceType getVentaResidenceType(int id) {
		return ventaResidenceTypeMap.get(id);
	}

	public static ResidenceType getResidentTypeForTargetUser(String targetUser) {
		return residenceTypeMap.get(targetUser);
	}
}