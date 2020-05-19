/**
 * @author nipunaggarwal
 *
 */
package com.stanzaliving.core.opscalculator.constants;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author nipunaggarwal
 *
 */
@Getter
@AllArgsConstructor
public enum WaterSupplySource {

	BOREWELL("Borewell"),
	GOVT_CONNECTION("Govt_Connection"),
	TANKER("Tanker");

	private String waterSupplySource;
}
