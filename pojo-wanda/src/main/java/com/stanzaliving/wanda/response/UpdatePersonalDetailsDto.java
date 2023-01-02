package com.stanzaliving.wanda.response;

import com.stanzaliving.wanda.dtos.ResidentEmergencyContactDto;
import com.stanzaliving.wanda.dtos.ResidentProfessionalDetailsDto;
import com.stanzaliving.wanda.dtos.ResidentRelationDto;
import com.stanzaliving.wanda.enums.StanzaService;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UpdatePersonalDetailsDto {
    String userUuid;
    ResidentProfessionalDetailsDto residentProfessionalDetailsDto;
    ResidentRelationDto residentRelationDto;
    ResidentEmergencyContactDto residentEmergencyContactDto;
    StanzaService source;
}
