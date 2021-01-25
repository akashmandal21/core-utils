package com.stanzaliving.transformations.enums;

import java.util.HashMap;
import java.util.Map;

import lombok.Getter;

@Getter
public enum SubBrandName {

	PRIMA("Prima"),
	MAGMA("Magna"),
	SAMA("Summa");

	private String subBrand;

	private SubBrandName(String subBrand) {
		this.subBrand = subBrand;
	}

	private static Map<String, SubBrandName> subBrandNameMap = new HashMap<>();

	static {

		for (SubBrandName subBrandName : SubBrandName.values()) {
			subBrandNameMap.put(subBrandName.getSubBrand(), subBrandName);
		}

	}
	
	public static SubBrandName getSubBrandNameEnumByName(String subBrandName) {
		return subBrandNameMap.get(subBrandName);
	}
}
