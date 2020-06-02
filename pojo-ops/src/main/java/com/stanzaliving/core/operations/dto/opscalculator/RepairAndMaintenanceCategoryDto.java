/**
 * @author nipunaggarwal
 *
 */
package com.stanzaliving.core.operations.dto.opscalculator;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.stanzaliving.core.operations.constants.opscalculator.Constants;

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
@JsonIgnoreProperties({ "count", "rate", "utilization" })
public class RepairAndMaintenanceCategoryDto extends CategoryDto {

	private int buildingMaintenance;
	private int repairAndMaintenance;

	@Builder.Default
	private int gst = Constants.GST_REPAIR_MAINTENANCE_PERCENT;

	@Builder.Default
	private int margin = Constants.MARGIN_REPAIR_MAINTENANCE_PERCENT;

}
