package com.stanzaliving.core.food.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum PackageCollectionStatus {

	COLLECTION_PENDING("Collection Pending", "Pending"),
	COLLECTED("Collected", "Picked"),
	CANCELLED("Cancelled", "Cancelled");

	private String name;
	private String displayName;
}