package com.stanzaliving.core.estate.enums;

import java.util.HashMap;
import java.util.Map;

import lombok.Getter;

@Getter
public enum OpexEstimateStatus {

	AUTO_GENERATED("Auto Generated"),
	APPROVED("Approved"),
	MODIFIED("Modified"),
	MODIFIED_NOT_APPROVED("Modified, not Approved");

	private String name;

	private static Map<OpexEstimateStatus, String> estateStatusMap = new HashMap<>();

	static {

		estateStatusMap.put(AUTO_GENERATED, OpexEstimateStatus.AUTO_GENERATED.getName());
		estateStatusMap.put(APPROVED, OpexEstimateStatus.APPROVED.getName());
		estateStatusMap.put(MODIFIED, OpexEstimateStatus.MODIFIED.getName());
		estateStatusMap.put(MODIFIED_NOT_APPROVED, OpexEstimateStatus.MODIFIED_NOT_APPROVED.getName());

	}

	private OpexEstimateStatus(String name) {
		this.name = name;
	}

	public static Map<OpexEstimateStatus, String> getAll() {
		return estateStatusMap;
	}

}