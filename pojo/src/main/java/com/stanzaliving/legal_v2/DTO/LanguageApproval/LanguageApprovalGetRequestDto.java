package com.stanzaliving.legal_v2.DTO.LanguageApproval;

import com.stanzaliving.core.user.dto.Address;
import com.stanzaliving.legal_v2.DTO.BdRemarks.AllRemarksResponseDto;
import com.stanzaliving.legal_v2.DTO.LegalTemplate.DeviationDTO;
import com.stanzaliving.legal_v2.enums.PropertyListStatus;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.util.Date;
import java.util.List;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class LanguageApprovalGetRequestDto{

    private String propertyName;
    
    private String rooms;
    
    private String beds;
    
    private String rent;

    private String mappedPropertyType;
    
    private String microMarket;
    
    private Address address;

    private String status;

    private String city;

    private List<AllRemarksResponseDto> bdRemarks;

    private String templateDocument;

    private List<DeviationDTO> deviations;

    private String email;

    @Temporal(TemporalType.TIMESTAMP)
    private Date propertyApprovalTime;

}
