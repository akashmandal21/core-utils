/**
 * @author nipunaggarwal
 *
 */
package com.stanzaliving.core.opscalculator.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import java.util.List;

/**
 * @author nipunaggarwal
 *
 */
@Getter
@Setter
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@ToString(callSuper = true)
@JsonIgnoreProperties({ "count", "rate", "utilization", "margin", "gst", "gstAmount" })
public class  EquipmentRentalCategoryDto extends CategoryDto {
//to be calculated only in case of rent

	@Builder.Default
	private boolean roomDthEnabled = false;
	private double roomDthCount;
	private double roomDthRent;
	private double roomDthCharges;

	@Builder.Default
	private boolean vendingMachineEnabled = false;
	private double vendingMachineCount;
	private double vendingMachineRent;
	private double vendingMachineCharges;

	@Builder.Default
	private boolean coffeeMachineEnabled = false;
	private double coffeeMachineCount;
	private double coffeeMachineRent;
	private double coffeeMachineCharges;

	@Builder.Default
	private boolean washingMachineEnabled = false;
	private double washingMachineCount;
	private double washingMachineRent;
	private double washingMachineCharges;

	@Builder.Default
	private boolean microwaveEnabled = false;
	private double microwaveCount;
	private double microwaveRent;
	private double microwaveCharges;


	@Builder.Default
	private boolean singleDoorFridgeEnabled = false;
	private double singleDoorFridgeCount;
	private double singleDoorFridgeRent;
	private double singleDoorFridgeCharges;

	@Builder.Default
	private boolean doubleDoorFridgeEnabled = false;
	private double doubleDoorFridgeCount;
	private double doubleDoorFridgeRent;
	private double doubleDoorFridgeCharges;

	@Builder.Default
	private boolean waterDispenserEnabled = false;
	private double waterDispenserCount;
	private double waterDispenserRent;
	private double waterDispenserCharges;

	@Builder.Default
	private boolean dryerEnabled = false;
	private double dryerCount;
	private double dryerRent;
	private double dryerCharges;

	@Builder.Default
	private boolean roEnabled = false;
	private double roCount;
	private double roRent;
	private double roCharges;

	@Builder.Default
	private boolean tvEnabled = false;
	private double tvCount;
	private double tvRent;
	private double tvCharges;

	@Builder.Default
	private boolean roomGeyserEnabled = false;
	private double roomGeyserCount;
	private double roomGeyserRent;
	private double roomGeyserCharges;

	@Builder.Default
	private boolean commonGeyserEnabled = false;
	private double commonGeyserCount;
	private double commonGeyserRent;
	private double commonGeyserCharges;

	@Builder.Default
	private boolean acEnabled = false;
	private double acCount;
	private double acRent;
	private double acCharges;

	@Builder.Default
	private boolean powerBackupEnabled = false;
	private double powerBackupCount;
	private double powerBackupRent;
	private double powerBackupCharges;

	@Builder.Default
	private boolean smartLockEnabled = false;
	private double smartLockCount;
	private double smartLockRent;
	private double smartLockCharges;

	@Builder.Default
	private boolean facialRecognitionEnabled = false;
	private double facialRecognitionCount;
	private double facialRecognitionRent;
	private double facialRecognitionCharges;

	@Builder.Default
	private boolean treadmillEnabled = false;
	private double treadmillCount;
	private double treadmillRent;
	private double treadmillCharges;

	@Builder.Default
	private boolean multiGymEnabled = false;
	private double multiGymCount;
	private double multiGymRent;
	private double multiGymCharges;

	List<SMLevelEquipmentRentalCategoryDto> smLevelEquipmentRentalCategoryDtoList;
}
