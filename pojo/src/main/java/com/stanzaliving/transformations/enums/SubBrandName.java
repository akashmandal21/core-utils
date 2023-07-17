package com.stanzaliving.transformations.enums;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.stanzaliving.core.base.common.dto.ListingDto;

import lombok.Getter;

@Getter
public enum SubBrandName {

	PRIMA("Prima"),
	MAGMA("Magna"),
	SAMA("Summa"),
	NA("Not Applicable");

	private String subBrand;

	private SubBrandName(String subBrand) {
		this.subBrand = subBrand;
	}

	private static Map<String, SubBrandName> subBrandNameMap = new HashMap<>();

	private static List<ListingDto> brandNameListing = new ArrayList<>();

	static {

		for (SubBrandName subBrandNameTage : SubBrandName.values()) {
			brandNameListing.add(ListingDto.builder().id(subBrandNameTage.name()).name(subBrandNameTage.getSubBrand()).build());
		}
	}
	
	static {

		for (SubBrandName subBrandName : SubBrandName.values()) {
			subBrandNameMap.put(subBrandName.getSubBrand(), subBrandName);
		}

	}
	
	public static List<ListingDto> getSubBrandNameListing() {
		return brandNameListing;
	}
	
	public static SubBrandName getSubBrandNameEnumByName(String subBrandName) {
		return subBrandNameMap.get(subBrandName);
	}
}
