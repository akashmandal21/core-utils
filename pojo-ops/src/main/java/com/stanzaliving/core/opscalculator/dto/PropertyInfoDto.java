/**
 * @author nipunaggarwal
 *
 */
package com.stanzaliving.core.opscalculator.dto;

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
public class PropertyInfoDto {

	public int getAnnualHolidayCount() {
		return annualHolidayCount;
	}

	public void setAnnualHolidayCount(int annualHolidayCount) {
		this.annualHolidayCount = annualHolidayCount;
	}

	private int annualHolidayCount;

	@Builder.Default
	private int occupancy = Constants.DEFUALT_OCCUPANCY_PERCENT;

}
