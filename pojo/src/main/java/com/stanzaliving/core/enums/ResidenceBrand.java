/**
 *
 */
package com.stanzaliving.core.enums;

import java.util.ArrayList;
import java.util.List;

import com.stanzaliving.core.user.enums.EnumListing;

/**
 * @author naveen.kumar
 *
 * @date 27-Dec-2019
 *
 **/
public enum ResidenceBrand {

	PRIMA,
	MAGNA,
	SUMMA;
	
		private static List<EnumListing<ResidenceBrand>> brandNameListing= new ArrayList<>();
		
		static {
			brandNameListing.add(EnumListing.of(ResidenceBrand.PRIMA, ResidenceBrand.PRIMA.name()));
			brandNameListing.add(EnumListing.of(ResidenceBrand.MAGNA, ResidenceBrand.MAGNA.name()));
			brandNameListing.add(EnumListing.of(ResidenceBrand.SUMMA, ResidenceBrand.SUMMA.name()));
		}
		
		public static List<EnumListing<ResidenceBrand>> getResidenceBrandNameListing() {
			return brandNameListing;
		}
}