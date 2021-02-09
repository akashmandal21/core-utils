package com.stanzaliving.core.operations.enums;

import com.stanzaliving.core.user.enums.EnumListing;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
@AllArgsConstructor
public enum DealType {

	B2C("B2C"),
	B2B("B2B");

	private String dealType;

	private static List<EnumListing<DealType>> dealTypes = new ArrayList<>();
	static {
		for(DealType dealType: DealType.values()){
			dealTypes.add(EnumListing.of(dealType, dealType.getDealType()));
		}
	}

	public static  List<EnumListing<DealType>> getDealTypes(){
		return dealTypes;
	}
}
