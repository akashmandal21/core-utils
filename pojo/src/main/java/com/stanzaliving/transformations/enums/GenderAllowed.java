package com.stanzaliving.transformations.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
public enum GenderAllowed {

	BOYS("Boys","#8C54FF"),GIRLS("Girls","#FD92AD"),COLIVING("Co-Living","#b4b4b0");
	
	String gender,color;
	GenderAllowed(String gender,String color){
		this.gender=gender;
		this.color=color;
	}
}
