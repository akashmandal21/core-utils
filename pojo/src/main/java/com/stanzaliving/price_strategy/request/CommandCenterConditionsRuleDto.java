/**
 * @author gaurav.likhar
 * @date 20/08/23
 * @project_name commercial-code-service
 **/

package com.stanzaliving.price_strategy.request;

import com.stanzaliving.commercialcard.enums.CommercialCodeType;
import com.stanzaliving.commercialcard.enums.CriteriaCondition;
import com.stanzaliving.price_strategy.enums.PriceImpactType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class CommandCenterConditionsRuleDto {
    private CommercialCodeType attribute;
    private CriteriaCondition operator;
    private String value;
    private PriceImpactType priceImpactType;
    private Double priceImpactValue;
}
