/**
 * @author nipunaggarwal
 *
 */
package com.stanzaliving.core.opscalculator.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class SMLevelEquipmentRentalCategoryDto {

	@Builder.Default
	private boolean roomDthEnabled = false;
	private int roomDthCount;
	private int roomDthRent;

	@Builder.Default
	private boolean vendingMachineEnabled = false;
	private int vendingMachineCount;
	private int vendingMachineRent;

	@Builder.Default
	private boolean coffeeMachineEnabled = false;
	private int coffeeMachineCount;
	private int coffeeMachineRent;

	@Builder.Default
	private boolean washingMachineEnabled = false;
	private int washingMachineCount;
	private int washingMachineRent;

	@Builder.Default
	private boolean microwaveEnabled = false;
	private int microwaveCount;
	private int microwaveRent;

	@Builder.Default
	private boolean singleDoorFridgeEnabled = false;
	private int singleDoorFridgeCount;
	private int singleDoorFridgeRent;

	@Builder.Default
	private boolean doubleDoorFridgeEnabled = false;
	private int doubleDoorFridgeCount;
	private int doubleDoorFridgeRent;

	@Builder.Default
	private boolean waterDispenserEnabled = false;
	private int waterDispenserCount;
	private int waterDispenserRent;

	@Builder.Default
	private boolean dryerEnabled = false;
	private int dryerCount;
	private int dryerRent;

	@Builder.Default
	private boolean roomGeyserEnabled = false;
	private int roomGeyserCount;
	private int roomGeyserRent;

	@Builder.Default
	private boolean commonGeyserEnabled = false;
	private int commonGeyserCount;
	private int commonGeyserRent;

	@Builder.Default
	private boolean acEnabled = false;
	private int acCount;
	private int acRent;

	@Builder.Default
	private boolean powerBackupEnabled = false;
	private int powerBackupCount;
	private int powerBackupRent;

}
