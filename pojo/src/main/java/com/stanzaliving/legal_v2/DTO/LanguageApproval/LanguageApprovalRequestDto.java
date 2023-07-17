package com.stanzaliving.legal_v2.DTO.LanguageApproval;

import com.stanzaliving.core.dto.AbstractMongoDto;
import com.stanzaliving.estate_v2.dto.propertyOnboarding.LegalAllRemarksResponseDto;
import com.stanzaliving.legal_v2.DTO.LegalTemplate.DeviationDTO;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.validation.constraints.NotNull;
import java.util.List;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class LanguageApprovalRequestDto extends AbstractMongoDto {

    @NotNull
    private String propertyId;

    private String templateDocument;

    private List<LegalAllRemarksResponseDto> bdRemarks;

    @NotNull
    private String propertyStatus;

    private List<DeviationDTO> deviationList;

}
