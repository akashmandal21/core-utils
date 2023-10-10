package com.stanzaliving.wanda.response;

import com.stanzaliving.core.user.dto.UserProfileDto;
import com.stanzaliving.wanda.dtos.ResidentEmergencyContactDto;
import com.stanzaliving.wanda.dtos.ResidentProfessionalDetailsDto;
import com.stanzaliving.wanda.dtos.ResidentRelationDto;

import lombok.*;

@NoArgsConstructor
@Builder
@Getter
@AllArgsConstructor
@Setter
public class OnBoardingGetResponse {

	private UserProfileDto userProfileDto;

	private ResidentProfessionalDetailsDto residentProfessionalDetailsDto;
	
	private ResidentEmergencyContactDto residentEmergencyContactDto;
	
	private ResidentRelationDto residentRelationDto;

}
