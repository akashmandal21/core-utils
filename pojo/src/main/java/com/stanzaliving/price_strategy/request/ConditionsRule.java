package com.stanzaliving.price_strategy.request;

import com.stanzaliving.commercialcard.enums.CommercialCodeType;
import com.stanzaliving.commercialcard.enums.CriteriaCondition;
import lombok.*;

@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Setter
public class ConditionsRule {
    //private BookingAttribute attribute;
    private CommercialCodeType attribute;
    private CriteriaCondition operator;
    private String value;
}
