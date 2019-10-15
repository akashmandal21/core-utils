package com.stanzaliving.transformations.enums;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang3.StringUtils;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum BrandName {
	PRIMA("Prima"),STELLO("Stello"),SERMA("Serma");

	String brand;
	
	public static List<BrandName> getBrandNames(String brandNames) {
		
		if(StringUtils.isNotEmpty(brandNames)) {
			
			String[] brands = brandNames.split(",");
			List<BrandName> names = new ArrayList<>();
			
			for (String brand : brands) {
				names.add(BrandName.valueOf(brand.toUpperCase()));
			}
			return names;
		}
		return Collections.emptyList();
	}
	
	public static String getBrandNamesString(List<BrandName> brandNames) {
	
			if(CollectionUtils.isNotEmpty(brandNames)) {
				
				StringBuilder builder = new StringBuilder();
				
				brandNames.forEach(brand->{
					builder.append(brand.getBrand());
					builder.append(",");
				});
				
				builder.deleteCharAt(builder.length() - 1);
				
				return builder.toString();
			}
		
			return null;
	}
	
}
