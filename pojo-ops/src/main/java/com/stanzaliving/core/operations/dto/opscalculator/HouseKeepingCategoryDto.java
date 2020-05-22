/**
 * @author nipunaggarwal
 *
 */
package com.stanzaliving.core.operations.dto.opscalculator;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.stanzaliving.core.operations.constants.opscalculator.Constants;

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
public class HouseKeepingCategoryDto extends CategoryDto {

	@Builder.Default
	private int gst = Constants.GST_HK_PERCENT;

	@Builder.Default
	private int margin = Constants.MARGIN_HK_PERCENT;

}
