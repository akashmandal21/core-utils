package com.stanzaliving.internet.enums;

import java.util.ArrayList;
import java.util.List;

import com.stanzaliving.core.enums.helpers.EnumValue;
import com.stanzaliving.core.user.enums.EnumListing;

import lombok.Getter;

@Getter
public enum InternetVendor implements EnumValue {

	SPECTRA("SPECTRA"), 
	JIO("Jio"), 
	ION("Ion"), 
	AIRTEL("Airtel"), 
	OTHER("Other");

	private String vendor;

	public String getVendor() {
		return vendor;
	}

	private InternetVendor(String vendor) {
		this.vendor = vendor;
	}

	@Override
	public String getValue() {
		return vendor;
	}

	private static List<EnumListing<InternetVendor>> internetVendorList = new ArrayList<>();
	static {
		for (InternetVendor internetVendor : InternetVendor.values()) {
			internetVendorList.add(EnumListing.of(internetVendor, internetVendor.getVendor()));
		}
	}

	public static List<EnumListing<InternetVendor>> getInternetVendorList() {
		return internetVendorList;
	}

}
