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
public class SubscriptionAndSuppliesCategoryDto extends CategoryDto {

	private int internet;
	private int cleaningSupplies;
	private int foodSupplies;

	@Builder.Default
	private int gst = Constants.GST_SUBSCRIPTION_SUPPLIES_PERCENT;

	@Builder.Default
	private int margin = Constants.MARGIN_SUBSCRIPTION_SUPPLIES_PERCENT;

}
