package com.stanzaliving.wanda.enums;

import java.util.ArrayList;
import java.util.List;

import com.stanzaliving.core.user.enums.EnumListing;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum RelationType {
	
	FATHER("Father"), MOTHER("Mother"), UNCLE("Uncle"), BROTHER("Brother"), SISTER("Sister"), AUNT("Aunt"), SPOUSE("Spouse");
	
	private String name;
	
	private static List<EnumListing<RelationType>> relationTypes= new ArrayList<>();

	static {
		for (RelationType relationType : RelationType.values()) {
			relationTypes.add(EnumListing.of(relationType, relationType.getName()));
		}
	}
	
	public static List<EnumListing<RelationType>> getRelationTypes() {
		return relationTypes;
	}

}