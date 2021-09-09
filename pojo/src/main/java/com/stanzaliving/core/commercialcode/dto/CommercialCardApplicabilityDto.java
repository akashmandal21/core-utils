package com.stanzaliving.core.commercialcode.dto;
import com.stanzaliving.commercialcard.enums.CommercialCodeType;
import com.stanzaliving.commercialcard.enums.CriteriaCondition;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class CommercialCardApplicabilityDto {
    private String uuid;

    private CommercialCodeType criteriaName;

    private String criteriaValue;

    @Builder.Default
    private CriteriaCondition criteriaCondition = CriteriaCondition.EQUAL_TO;

    @Builder.Default
    private boolean isApplicable = true;


}
