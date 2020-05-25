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
@ToString
@SuperBuilder
@NoArgsConstructor
@JsonIgnoreProperties({ "utilization" })
public class UniformCostsCategoryDto extends CategoryDto {
	
	private int lifeOfUniform;

	@Builder.Default
	private int gst = Constants.GST_UNIFORM_COSTS_PERCENT;

	@Builder.Default
	private int margin = Constants.MARGIN_UNIFORM_COSTS_PERCENT;

}
