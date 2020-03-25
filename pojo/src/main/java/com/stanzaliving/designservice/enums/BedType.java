/**
 * 
 */
package com.stanzaliving.designservice.enums;

import lombok.Getter;

/**
 * @author raj.kumar
 *
 */
@Getter
public enum BedType {

	PRIMA("Prima"),
	MAGNA("Magna"),
	SUMMA("Summa");
	
	private String bedTypeName;
	
	private BedType(String bedTypeName) {
		this.bedTypeName = bedTypeName;
	}
}
