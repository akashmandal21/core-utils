package com.stanzaliving.core.commercialcode.dto;

import com.stanzaliving.commercialcard.enums.CommercialCardUserType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CommercialCardDto {
    private List<CommercialCardApplicabilityDto> applicabilityDtoList;

    private CommercialCardUserType commercialCardUserType;


}
