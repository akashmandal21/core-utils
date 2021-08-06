package com.stanzaliving.core.food.dto;

import com.stanzaliving.core.base.common.dto.AbstractDto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@ToString(callSuper = true)
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class FoodVendorDto extends AbstractDto {

	private String name;

	private String cityId;
	
	private String cityName;

	private String contactName;

	private String contactNumber;

	private String contactEmail;

	private boolean stanzaKitchen;

	private String gstin;

	private String fassai;

	private String gstCompanyName;

	private String gstCompanyAddress;

	private String vendorMasterUuid;

	private String vendorCode;
	
	
	
}
