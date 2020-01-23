package com.stanzaliving.transformations.enums;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang3.StringUtils;

import lombok.Getter;

@Getter
public enum BrandName {

	SUITS("Suits"),
	STELLO("Stello");

	private String brand;

	private BrandName(String brand) {
		this.brand = brand;
	}

	private static Map<String, BrandName> brandNameMap = new HashMap<>();

	static {

		for (BrandName brandName : BrandName.values()) {
			brandNameMap.put(brandName.getBrand(), brandName);
		}

	}

	public static List<BrandName> getBrandNames(String brandNames, String separator) {

		if (StringUtils.isNotBlank(brandNames)) {

			String[] brands = brandNames.split(separator);

			List<BrandName> names = new ArrayList<>();

			for (String brand : brands) {
				if (Objects.nonNull(brandNameMap.get(brand))) {
					names.add(brandNameMap.get(brand));
				} else {
					names.add(BrandName.valueOf(brand));
				}
			}

			return names;
		}

		return Collections.emptyList();
	}

	public static String getBrandNamesString(List<BrandName> brandNames) {

		if (CollectionUtils.isNotEmpty(brandNames)) {

			StringBuilder builder = new StringBuilder();

			brandNames.forEach(brand -> {
				builder.append(brand.getBrand());
				builder.append(",");
			});

			builder.deleteCharAt(builder.length() - 1);

			return builder.toString();
		}

		return null;
	}

}
