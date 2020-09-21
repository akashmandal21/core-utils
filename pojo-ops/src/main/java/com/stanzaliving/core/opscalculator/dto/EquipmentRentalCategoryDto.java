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
	private int vendingMachineCount;
	private int vendingMachineRent;
	private int vendingMachineCharges;

	private int coffeeMachineCount;
	private int coffeeMachineRent;
	private int coffeeMachineCharges;

	private int washingMachineCount;
	private int washingMachineRent;
	private int washingMachineCharges;


	@Builder.Default
	private boolean vendingMachineEnabled = false;


	@Builder.Default
	private boolean coffeeMachineEnabled = false;

	private int elecricityRoomMeterCost;

}
