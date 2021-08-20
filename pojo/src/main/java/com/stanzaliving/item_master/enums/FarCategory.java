/**
 * @author nipunaggarwal
 *
 */
package com.stanzaliving.item_master.enums;

import java.util.Collection;
import java.util.SortedMap;
import java.util.TreeMap;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author nipunaggarwal
 *
 */
@Getter
@AllArgsConstructor
public enum FarCategory {

	NA("Not Applicable"),
	COUNTABLE("Countable"),
	TAGGABLE("Taggable"),
	NON_TAGGABLE("Not Taggable");

	private String text;
	private static SortedMap<String, FarCategory> farCategoriesMap = new TreeMap<String, FarCategory>();

	static {
		for (FarCategory fc : FarCategory.values()) {
			farCategoriesMap.put(fc.getText(), fc);
		}
	}

	public static Collection<FarCategory> getfarCategories() {
		return farCategoriesMap.values();
	}

}