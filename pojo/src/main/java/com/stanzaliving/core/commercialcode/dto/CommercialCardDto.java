package com.stanzaliving.core.commercialcode.dto;

import com.stanzaliving.commercialcard.enums.CommercialCardUserType;
import lombok.*;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class CommercialCardDto {

    private List<CommercialCardApplicabilityDto> applicabilityDtoList;

    private CommercialCardUserType commercialCardUserType;

    private Double monthlyRent;
    
    private Boolean modifyContractFlow = Boolean.FALSE;

    private String appliedCommercialCard;
}
