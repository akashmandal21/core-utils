/**
 * @author nipunaggarwal
 *
 */
package com.stanzaliving.core.opscalculator.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.stanzaliving.core.opscalculator.constants.Constants;

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
@JsonIgnoreProperties({ "count", "rate", "utilization" })
public class RepairAndMaintenanceCategoryDto extends CategoryDto {

	private int buildingMaintenance;
	private int repairAndMaintenance;

	@Builder.Default
	private int gst = Constants.GST_REPAIR_MAINTENANCE_PERCENT;

	@Builder.Default
	private int margin = Constants.MARGIN_REPAIR_MAINTENANCE_PERCENT;

}
