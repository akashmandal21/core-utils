/**
 * @author nipunaggarwal
 *
 */
package com.stanzaliving.core.opscalculator.dto;

import lombok.*;
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
public abstract class CategoryDto {

	private String categoryName;
	private int costPerAvailableBed;
	private int costPerOccupiedBed;
	private double contribution;

	@Builder.Default
	private boolean enabled = true;		//default all services enabled

	public void clearValues() {
		this.costPerAvailableBed = 0;
		this.costPerOccupiedBed = 0;
		this.contribution = 0d;
	}

}
