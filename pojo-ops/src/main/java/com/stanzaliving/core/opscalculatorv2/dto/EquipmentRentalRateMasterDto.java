
package com.stanzaliving.core.opscalculatorv2.dto;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

/**
 * @author manish.pareek
 *
 */
@Getter
@Setter
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@ToString(callSuper = true)
public class EquipmentRentalRateMasterDto implements Serializable {

    private String cityUuid;
    private String microMarketUuid;
    private String standardEquipRental;
    private String rentedAc;
    private String smartMeters;
    private String tvRent;
    private String treadmill;
    private String exerciseBike;
    private String multiGym;

}
