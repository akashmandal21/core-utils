package com.stanzaliving.wanda.response;

import com.stanzaliving.core.base.common.dto.ResponseDto;
import com.stanzaliving.wanda.dtos.BankDetailsDto;
import com.stanzaliving.wanda.dtos.ResidentEmergencyContactDto;
import com.stanzaliving.wanda.dtos.ResidentRelationDto;
import com.stanzaliving.wanda.dtos.UpiDetailsDto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Builder
@AllArgsConstructor
@Getter
public class MigrationDto {

    private String userUuid;
    private ResidentProfessionalDetailsResponseDto residentProfessionalDetailsResponseDto;
    private ResponseDto<BankDetailsDto> bankDetailsDtoResponseDto;
    private ResponseDto<UpiDetailsDto> residentUpiDetails;
    private WandaFileResponseDto wandaFileResponseDto;
    private ResidentRelationDto residentRelationDto;
    private ResidentEmergencyContactDto residentEmergencyContactDto;
    private ConsumerTemporaryMapping consumerTemporaryMapping;
}
