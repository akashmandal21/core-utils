package com.stanzaliving.core.opscalculatorv2.dto;



import java.math.BigDecimal;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@SuperBuilder
@NoArgsConstructor
@ToString(callSuper = true)
public class EquipmentRentalDevicesV2Dto {

    @Builder.Default
    private BigDecimal quantity = new BigDecimal(0);
    @Builder.Default
    private BigDecimal rentalPerMonthPerQty = new BigDecimal(0);

}
