/**
 * @author nipunaggarwal
 *
 */
package com.stanzaliving.core.opscalculator.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.stanzaliving.core.opscalculator.constants.Constants;

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
@ToString(callSuper = true)
@JsonIgnoreProperties({ "utilization" })
public class HouseKeepingCategoryDto extends CategoryDto {

	private boolean is8HourApplicable;
	private boolean is12HourApplicable;
	private boolean isContractApplicable;

	private HouseKeepingInfoDto houseKeepingInfo8HourDto;
	private HouseKeepingInfoDto houseKeepingInfo12HourDto;
	private HouseKeepingInfoDto houseKeepingInfoContractDto;

	private int houseKeeping8HourCharges;
	private int houseKeeping12HourCharges;
	private int houseKeepingContractHourCharges;



	@Builder.Default
	private int gst = Constants.GST_HK_PERCENT;

	@Builder.Default
	private int margin = Constants.MARGIN_HK_PERCENT;

}
