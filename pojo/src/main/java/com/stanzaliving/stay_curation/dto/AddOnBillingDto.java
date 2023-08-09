package com.stanzaliving.stay_curation.dto;

import com.stanzaliving.stay_curation.enums.AddOnStatus;
import com.stanzaliving.stay_curation.enums.BillingPreference;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
public class AddOnBillingDto {

    private String billingId;

    private BillingPreference billingPreference;

    private Double basePrice;

    private InfoDto applicableDurationDays;

    @Builder.Default
    private AddOnStatus status = AddOnStatus.ACTIVE;

}
