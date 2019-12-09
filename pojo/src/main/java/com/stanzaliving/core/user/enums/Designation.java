/**
 * 
 */
package com.stanzaliving.core.user.enums;

import java.util.EnumMap;
import java.util.Map;

import lombok.Getter;

/**
 * @author naveen.kumar
 *
 * @date 10-Dec-2019
 *
 **/
@Getter
public enum Designation {

	SDE("Software Development Engineer"),
	EM("Engineering Manager"),
	PM("Product Manager");

	private String name;

	private Designation(String name) {
		this.name = name;
	}

	private static Map<Designation, String> designationNameMap = new EnumMap<>(Designation.class);

	static {

		for (Designation designation : Designation.values()) {
			designationNameMap.put(designation, designation.getName());
		}
	}

	public static Map<Designation, String> getDesignations() {
		return designationNameMap;
	}
}