
package com.stanzaliving.core.opscalculatorv2.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

/**
 * @author manish.pareek
 *
 */
@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public abstract class CategoryV2Dto implements Cloneable {

	public String categoryName;
	public int costPerAvailableBed;
	public int costPerOccupiedBed;
	public double contribution;

	@Builder.Default
	public boolean enabled = true;		//default all services enabled

	public void clearValues() {
		this.costPerAvailableBed = 0;
		this.costPerOccupiedBed = 0;
		this.contribution = 0d;
	}

	public Object clone() {
		try {
			return super.clone();
		} catch (CloneNotSupportedException e) {
			throw new RuntimeException(e);
		}
	}
}
