package com.stanzaliving.core.commercialcode.dto;
import com.stanzaliving.commercialcard.enums.CommercialCodeType;
import com.stanzaliving.commercialcard.enums.CriteriaCondition;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CommercialCardApplicabilityDto {
    private String uuid;

    private CommercialCodeType criteriaName;

    private String criteriaValue;

    private CriteriaCondition criteriaCondition;

    private boolean isApplicable = true;


}
