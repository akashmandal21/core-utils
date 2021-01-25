package com.stanzaliving.core.food.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author piyush srivastava
 *
 * @date 09-June-2020
 *
 **/
@Getter
@AllArgsConstructor
public enum FoodVendorDocumentType {

	FASSAI_LICENCE_CERITIFACTE("Food Licence"),
	GSTIN_CERTIFICATE("GST Certificate");

	private String docType;
}