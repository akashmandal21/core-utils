package com.stanzaliving.core.commercialcode.dto;
import com.stanzaliving.commercialcard.enums.CommercialCodeType;
import com.stanzaliving.commercialcard.enums.CriteriaCondition;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CommercialCardApplicabilityDto {
    private String uuid;

    private CommercialCodeType criteriaName;

    private String criteriaValue;

    private CriteriaCondition criteriaCondition;

    private boolean isApplicable = true;


}
