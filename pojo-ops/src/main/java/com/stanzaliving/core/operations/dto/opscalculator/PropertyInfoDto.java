/**
 * @author nipunaggarwal
 *
 */
package com.stanzaliving.core.operations.dto.opscalculator;

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
public class PropertyInfoDto {

	private int bedCount;
	private int roomCount;

	@Builder.Default
	private int occupancy = Constants.DEFUALT_OCCUPANCY_PERCENT;

}
