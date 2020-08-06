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
}
