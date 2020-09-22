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
public class UniformCostsCategoryDto extends CategoryDto {

	boolean rcOeUniformRequired;
	boolean hkUniformRequired;

	@Builder.Default
	private int lifeOfUniform = 12;

	UniformRequirementDto rcOeUniformRequirementDto;
	UniformRequirementDto hkUniformRequirementDto;

	int rcOeUniformCharges;
	int hkUniformCharges;


	@Builder.Default
	private int gst = Constants.GST_UNIFORM_COSTS_PERCENT;

	@Builder.Default
	private int margin = Constants.MARGIN_UNIFORM_COSTS_PERCENT;

}
