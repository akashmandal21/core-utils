package com.stanzaliving.vendor.model;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class VendorAndPocDetails {

	VendorDetailsDto vendorDetailsDto;
	
	List<VendorPocDetailsDto> pocDetailsDtos;
	
}
