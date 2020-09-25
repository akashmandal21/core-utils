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
@JsonIgnoreProperties({ "count", "rate" })
public class LaundryCostCategoryDto extends CategoryDto {

	private int clothesPerPersonPerMonth;
	private double weightPerCloth;
	private int costPerKg;
	private int utilizationPercent;
	private boolean leninLaundryInclude;
	private int leninCost;

	@Builder.Default
	private int gst = Constants.GST_LAUNDRY_PERCENT;

	@Builder.Default
	private int margin = Constants.MARGIN_LAUNDRY_PERCENT;

}
