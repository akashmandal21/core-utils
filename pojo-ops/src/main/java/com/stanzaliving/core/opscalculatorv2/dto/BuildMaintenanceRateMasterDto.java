package com.stanzaliving.core.opscalculatorv2.dto;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@ToString(callSuper = true)
public class BuildMaintenanceRateMasterDto implements Serializable  {

	private String cityUuid;
	
	private String microMarketUuid;

	private String pestControlRoomRatePerMonth;

	private String floorCleaningMachineRentalPerMonth;

	private String floorCleaningManpowerCostPerPerson;

	private String tankCleaningTankSize;

	private String tankCleaningOneTimeRate;

	private String upholsteryCleaningRatePerSeat;

	private String fumigationCleaningCostPerBed;

}
