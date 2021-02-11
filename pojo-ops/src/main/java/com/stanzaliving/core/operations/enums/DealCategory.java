package com.stanzaliving.core.operations.enums;

import com.stanzaliving.core.user.enums.EnumListing;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
@AllArgsConstructor
public enum DealCategory {

	B2C("B2C"),
	B2B("B2B");

	private String dealCategory;

	private static List<EnumListing<DealCategory>> dealCategories = new ArrayList<>();
	static {
		for(DealCategory dealCategory : DealCategory.values()){
			dealCategories.add(EnumListing.of(dealCategory, dealCategory.getDealCategory()));
		}
	}

	public static  List<EnumListing<DealCategory>> getDealCategories(){
		return dealCategories;
	}
}
