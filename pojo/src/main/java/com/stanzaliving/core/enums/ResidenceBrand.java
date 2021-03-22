/**
 *
 */
package com.stanzaliving.core.enums;

import java.util.ArrayList;
import java.util.List;

import com.stanzaliving.core.user.enums.EnumListing;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author naveen.kumar
 *
 * @date 27-Dec-2019
 *
 **/
@Getter
@AllArgsConstructor
public enum ResidenceBrand {

	PRIMA("Prima"), 
	MAGNA("Magna"), 
	SUMMA("Summa");
	
	String brandName;
	
	private static List<EnumListing<ResidenceBrand>> brandNameListing= new ArrayList<>();
	
	static {
		brandNameListing.add(EnumListing.of(ResidenceBrand.PRIMA, ResidenceBrand.PRIMA.getBrandName()));
		brandNameListing.add(EnumListing.of(ResidenceBrand.MAGNA, ResidenceBrand.MAGNA.getBrandName()));
		brandNameListing.add(EnumListing.of(ResidenceBrand.SUMMA, ResidenceBrand.SUMMA.getBrandName()));
	}
	
	public static List<EnumListing<ResidenceBrand>> getResidenceBrandNameListing() {
		return brandNameListing;
	}

}