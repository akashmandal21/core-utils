package com.stanzaliving.legal_v2.DTO.LanguageApproval;

import com.stanzaliving.core.dto.AbstractMongoDto;
import com.stanzaliving.legal_v2.DTO.BdRemarks.AllRemarksResponseDto;
import com.stanzaliving.legal_v2.DTO.LegalTemplate.CodeBlock;
import com.stanzaliving.legal_v2.DTO.LegalTemplate.DeviationDTO;
import com.stanzaliving.legal_v2.enums.PropertyListStatus;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.validation.Valid;
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

    private List<AllRemarksResponseDto> bdRemarks;

    @NotNull
    private String propertyStatus;

    private List<DeviationDTO> deviationList;

}
