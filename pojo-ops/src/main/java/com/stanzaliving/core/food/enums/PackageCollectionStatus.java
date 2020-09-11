package com.stanzaliving.core.food.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor

public enum PackageCollectionStatus {

	COLLECTION_PENDING("Collection Pending"),
	COLLECTED("Collected"),
	CANCELLED("Cancelled");
	
	private String name;
}
