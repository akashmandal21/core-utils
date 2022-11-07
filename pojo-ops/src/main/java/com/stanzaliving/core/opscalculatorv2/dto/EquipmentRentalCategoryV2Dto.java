package com.stanzaliving.core.opscalculatorv2.dto;

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

    private boolean equipmentRentalApplicable;
    private double standardEquipRental;

    private int rentedAcCount;
    private int smartMetersCount;
    private int tvCount;
    private int trademillCount;
    private int exerciseBikeCount;
    private int multiGymCount;

    private double rentedAcRentalPerMonth;
    private double smartMetersRentalPerMonth;
    private double tvRentalPerMonth;
    private double trademillRentalPerMonth;
    private double exerciseBikeRentalPerMonth;
    private double multiGymRentalPerMonth;

}
