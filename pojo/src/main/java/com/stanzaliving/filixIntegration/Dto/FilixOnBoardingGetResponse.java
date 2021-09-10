package com.stanzaliving.filixIntegration.Dto;

import com.stanzaliving.core.user.dto.UserProfileDto;
import lombok.*;

@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class FilixOnBoardingGetResponse {
    private UserProfileDto userProfileDto;

    private ResidentProfessionalDetailsDto residentProfessionalDetailsDto;

    private ResidentEmergencyContactDto residentEmergencyContactDto;

    private ResidentRelationDto residentRelationDto;
}
