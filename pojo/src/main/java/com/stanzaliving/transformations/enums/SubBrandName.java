package com.stanzaliving.transformations.enums;

import lombok.Getter;

@Getter
public enum SubBrandName {

	PRIMA("Prima"),
	STELLO("Stello"),
	SERMA("Serma");

	private String subBrand;

	private SubBrandName(String subBrand) {
		this.subBrand = subBrand;
	}

}
