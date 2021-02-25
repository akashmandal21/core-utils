package com.stanzaliving.core.food.enums;

import com.stanzaliving.operations.dto.servicemix.Tag;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.HashMap;
import java.util.Map;

@Getter
@AllArgsConstructor
public enum TagLabel {

	PRIMARY("Primary"),
	CUISINE("Cuisine"),
	REGIONAL("Regional");

	private String tagType;

	private static Map<String, TagLabel> tagLabelHashMap = new HashMap<>();

	private static Map<String, TagLabel> tagLabelMap = new HashMap<>();

	static {
		for (TagLabel tagLabel : TagLabel.values()) {

			tagLabelHashMap.put(tagLabel.getTagType(), tagLabel);

			tagLabelMap.put(tagLabel.name(), tagLabel);
		}
	}

	public static Map<String, TagLabel> getFoodItemTypeNameMap() {
		return tagLabelHashMap;
	}

	public static TagLabel getTagTypeByName(String typeName) {
		return tagLabelHashMap.get(typeName);
	}

	public static TagLabel getTagTypeByType(String itemType) {
		return tagLabelMap.get(itemType);
	}


}

