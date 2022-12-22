package com.stanzaliving.price_strategy.request;

import com.stanzaliving.booking.enums.MaintenanceFeeCollectionType;
import com.stanzaliving.commercialcard.enums.FeeCollectionStrategy;
import lombok.*;

@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Setter
public class MaintenanceFeeDto {
    private Boolean monthlyCharges;
    private Double monthlyChargesValue;
    private Boolean fixedCharges;
    private Double fixedChargesValue;
    private FeeCollectionStrategy collectionStrategy;
    private MaintenanceFeeCollectionType collectionStrategyForOld;
}
