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
public class EquipmentRentalCategoryV2Dto extends CategoryV2Dto {

    @Builder.Default
    private boolean equipmentRentalApplicable = true;

    @Builder.Default
    private BigDecimal standardEquipRental = new BigDecimal(0);

    @Builder.Default
    EquipmentRentalDevicesV2Dto rentedAcDto = new EquipmentRentalDevicesV2Dto();

    @Builder.Default
    EquipmentRentalDevicesV2Dto smartMetersDto = new EquipmentRentalDevicesV2Dto();

    @Builder.Default
    EquipmentRentalDevicesV2Dto tvDto = new EquipmentRentalDevicesV2Dto();

    @Builder.Default
    EquipmentRentalDevicesV2Dto treadmillDto = new EquipmentRentalDevicesV2Dto();

    @Builder.Default
    EquipmentRentalDevicesV2Dto exerciseBikeDto = new EquipmentRentalDevicesV2Dto();

    @Builder.Default
    EquipmentRentalDevicesV2Dto multiGymDto = new EquipmentRentalDevicesV2Dto();

}
