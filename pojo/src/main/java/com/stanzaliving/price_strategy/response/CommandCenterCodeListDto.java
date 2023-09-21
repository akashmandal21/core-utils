/**
 * @author gaurav.likhar
 * @date 20/08/23
 * @project_name commercial-code-service
 **/

package com.stanzaliving.price_strategy.response;

import com.stanzaliving.commercialcard.enums.CommercialCardStatus;
import com.stanzaliving.core.commercialcode.dto.CommercialCardApplicabilityDto;
import com.stanzaliving.price_strategy.enums.PriceImpactType;
import lombok.*;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class CommandCenterCodeListDto {
    private String commandCenterUuid;

    private String pricingStrategyName;

    private PriceImpactType priceImpactType;

    private Double priceImpactValue;

    private List<CommercialCardApplicabilityDto> applicabilityDtoList;

    private CommercialCardStatus cardStatus;

    private boolean isAutoApplicable;

}
