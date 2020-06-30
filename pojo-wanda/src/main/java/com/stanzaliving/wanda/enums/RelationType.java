package com.stanzaliving.wanda.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum RelationType {
	
	FATHER("Father"), MOTHER("Mother"), UNCLE("Uncle"), BROTHER("Brother"), SISTER("Sister"), AUNT("Aunt"), SPOUSE("Spouse");
	
	private String name;
}