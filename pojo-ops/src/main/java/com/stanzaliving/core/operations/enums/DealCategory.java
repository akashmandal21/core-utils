package com.stanzaliving.core.operations.enums;
/**
 * @author manish.pareek
 *
 * @date 05-Feb-2021
 */

import com.stanzaliving.core.user.enums.EnumListing;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
@AllArgsConstructor
public enum DealCategory {

	B2B("B2B Deal"),
	B2C("B2C Deal");
	
	private String dealCategoryName;

	private static List<EnumListing<DealCategory>> dealCategories = new ArrayList<>();
	static {
		for(DealCategory dealCategory : DealCategory.values()){
			dealCategories.add(EnumListing.of(dealCategory, dealCategory.getDealCategoryName()));
		}
	}

	public static  List<EnumListing<DealCategory>> getDealCategories(){
		return dealCategories;
	}
}
