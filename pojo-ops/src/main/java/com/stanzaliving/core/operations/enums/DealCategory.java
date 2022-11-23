package com.stanzaliving.core.operations.enums;
/**
 * @author manish.pareek
 *
 * @date 05-Feb-2021
 */

import com.stanzaliving.core.user.enums.EnumListing;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public enum DealCategory {

	B2B("B2B", 2),
	B2C("B2C", 1);
	
	private String dealCategoryName;
	
	private int sequence;

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
