package com.stanzaliving.transformations.enums;

import lombok.Getter;

@Getter
public enum SubBrandName {

	PRIMA("Prima"),
	MAGMA("Magma"),
	SAMA("Sama");

	private String subBrand;

	private SubBrandName(String subBrand) {
		this.subBrand = subBrand;
	}

}
