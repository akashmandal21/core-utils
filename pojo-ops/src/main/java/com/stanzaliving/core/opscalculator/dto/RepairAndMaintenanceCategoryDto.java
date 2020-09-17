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

	private PestControlDto pestControlDto;
	private FloorCleaningDto floorCleaningDto;
	private TankCleaningInfoDto tankCleaningInfoDto;
	private FacadeCleaningDto facadeCleaningDto;
	private UpholsteryCleaningDto upholsteryCleaningDto;
	private FumigationPerBedBugsDto fumigationPerBedBugsDto;
	private GarbageCostDto garbageCostDto;

}
