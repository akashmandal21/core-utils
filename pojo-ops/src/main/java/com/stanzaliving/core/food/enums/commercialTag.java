package com.stanzaliving.core.food.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Getter
@AllArgsConstructor
public enum CommercialTag {
	HIGH ("High"),
	MEDIUM ("Medium"),
	LOW ("Low");

	private final String tagName;


	public static Set<CommercialTag> getCommercialTagFromCSV(String csvString) {

		Set<CommercialTag> commercialTags = new HashSet<>();

		if (StringUtils.isNotBlank(csvString)) {

			String[] splitString = csvString.split(",");

			for (String string : splitString) {

				if (StringUtils.isNotBlank(string)) {
					CommercialTag.valueOf(string);
					commercialTags.add(CommercialTag.valueOf(string));
				}

			}

		}

		return commercialTags;
	}
}
