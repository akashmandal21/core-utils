package com.stanzaliving.wanda.response;

import com.stanzaliving.core.user.dto.UserProfileDto;
import com.stanzaliving.wanda.dtos.ResidentEmergencyContactDto;
import com.stanzaliving.wanda.dtos.ResidentProfessionalDetailsDto;
import com.stanzaliving.wanda.dtos.ResidentRelationDto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Builder
@Getter
@AllArgsConstructor
public class OnBoardingGetResponse {

	private UserProfileDto userProfileDto;

	private ResidentProfessionalDetailsDto residentProfessionalDetailsDto;
	
	private ResidentEmergencyContactDto residentEmergencyContactDto;
	
	private ResidentRelationDto residentRelationDto;
}
