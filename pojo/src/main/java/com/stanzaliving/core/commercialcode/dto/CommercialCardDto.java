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

}
