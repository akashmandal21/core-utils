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
	private int roomDthCount;
	private int roomDthRent;
	private int roomDthCharges;

	@Builder.Default
	private boolean vendingMachineEnabled = false;
	private int vendingMachineCount;
	private int vendingMachineRent;
	private int vendingMachineCharges;

	@Builder.Default
	private boolean coffeeMachineEnabled = false;
	private int coffeeMachineCount;
	private int coffeeMachineRent;
	private int coffeeMachineCharges;

	@Builder.Default
	private boolean washingMachineEnabled = false;
	private int washingMachineCount;
	private int washingMachineRent;
	private int washingMachineCharges;

	@Builder.Default
	private boolean microwaveEnabled = false;
	private int microwaveCount;
	private int microwaveRent;
	private int microwaveCharges;


	@Builder.Default
	private boolean singleDoorFridgeEnabled = false;
	private int singleDoorFridgeCount;
	private int singleDoorFridgeRent;
	private int singleDoorFridgeCharges;

	@Builder.Default
	private boolean doubleDoorFridgeEnabled = false;
	private int doubleDoorFridgeCount;
	private int doubleDoorFridgeRent;
	private int doubleDoorFridgeCharges;

	@Builder.Default
	private boolean waterDispenserEnabled = false;
	private int waterDispenserCount;
	private int waterDispenserRent;
	private int waterDispenserCharges;

	@Builder.Default
	private boolean dryerEnabled = false;
	private int dryerCount;
	private int dryerRent;
	private int dryerCharges;

	private int elecricityRoomMeterCost;

}
