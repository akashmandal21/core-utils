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
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties({ "count", "rate", "utilization", "margin", "gst", "gstAmount" })
public class EquipmentRentalCategoryDto extends CategoryDto {

	private int vendingMachine;

	@Builder.Default
	private boolean vendingMachineEnabled = false;

	private int coffeeMachine;

	@Builder.Default
	private boolean coffeeMachineEnabled = false;

	private int elecricityRoomMeterCost;

}
