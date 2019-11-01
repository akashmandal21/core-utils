package com.stanzaliving.estimators.dto;

import java.util.HashMap;
import java.util.Map;

import lombok.Getter;

@Getter
public enum AssumptionSource {

	OPS("Electrical"),
	MR("Design"),
	PR_SERV_MIX("PR Serv Mix");

	private String name;

	private AssumptionSource(String name) {
		this.name = name;
	}

	private static Map<String, AssumptionSource> assumptionsSourceByNameMap = new HashMap<>();

	static {

		for (AssumptionSource source : AssumptionSource.values()) {
			assumptionsSourceByNameMap.put(source.getName(), source);
		}
	}

	public static AssumptionSource getAssumptionSourceByName(String name) {
		return assumptionsSourceByNameMap.get(name);
	}

}