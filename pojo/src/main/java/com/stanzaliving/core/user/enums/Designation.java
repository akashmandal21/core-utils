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

	SDE_1("Software Development Engineer", 1),
	EM("Engineering Manager", 0),
	PM("Product Manager", 0);

	private String name;
	private int level;

	private Designation(String name, int level) {
		this.name = name;
		this.level = level;
	}

	private static Map<Designation, String> designationNameMap = new EnumMap<>(Designation.class);

	static {

		for (Designation designation : Designation.values()) {

			String designationName = designation.getName();

			if (designation.getLevel() > 0) {
				designationName = designationName.concat("-" + designation.getLevel());
			}
			designationNameMap.put(designation, designation.getName());
		}
	}

	public static Map<Designation, String> getDesignations() {
		return designationNameMap;
	}
}