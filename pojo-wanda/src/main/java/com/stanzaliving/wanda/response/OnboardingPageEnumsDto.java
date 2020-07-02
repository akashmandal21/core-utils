package com.stanzaliving.wanda.response;

import java.util.List;

import com.stanzaliving.core.user.enums.BloodGroup;
import com.stanzaliving.core.user.enums.EnumListing;
import com.stanzaliving.core.user.enums.Gender;
import com.stanzaliving.core.user.enums.Nationality;
import com.stanzaliving.wanda.enums.RelationType;
import com.stanzaliving.wanda.enums.ResidentType;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
@AllArgsConstructor
public class OnboardingPageEnumsDto {

	private List<EnumListing<BloodGroup>> bloodGroup;
	
	private List<EnumListing<Nationality>> nationaility;
	
	private List<EnumListing<Gender>> gender;
	
	private List<EnumListing<ResidentType>> residentTypes;
	
	private List<EnumListing<RelationType>> relationTypes;
	
}
