package com.stanzaliving.wanda.venta.request;

import com.stanzaliving.core.food.enums.DemoGraphicsRegion;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CoreUserRequestDto {

	private String foodPreference;
	private DemoGraphicsRegion foodRegionPreference;
	private String pincode;
	private String gender;
	private String clientName;
	private String hostel;
	private String residenceUuid;
	private String city;
	private String userSource;
	private String dateOfBirth;
	private String mobileNo;
	private String userName;
	private String email;
	private String house;
	private String userCode;
	private String courseName;
	private String state;
	private String room;
	private String status;
	private boolean isBlocked;
	private boolean movedIn;
	private boolean optedOut;
	private boolean tifinActive;
	private String userUuid;
	private String countryCode;
}
