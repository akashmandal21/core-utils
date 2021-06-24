package com.stanzaliving.legal_v2.DTO.LanguageApproval;

import com.stanzaliving.legal_v2.DTO.LegalTemplate.DeviationDTO;
import com.stanzaliving.legal_v2.DTO.BdRemarks.BdRemarksDto;
import com.stanzaliving.legal_v2.enums.PropertyListStatus;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class LanguageApprovalGetRequestDto{

    private String propertyName;

    private String mappedPropertyType;
    
    private String microMarket;

    private PropertyListStatus status;

    private String city;

    private List<BdRemarksDto> bdRemarks;

    private String templateDocument;

    private List<DeviationDTO> deviations;
}
