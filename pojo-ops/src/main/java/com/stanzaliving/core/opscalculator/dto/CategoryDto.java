/**
 * @author nipunaggarwal
 *
 */
package com.stanzaliving.core.opscalculator.dto;

import lombok.AllArgsConstructor;
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
public abstract class CategoryDto {

	private String CategoryName;
	private int costPerAvailableBed;
	private int costPerOccupiedBed;
	private double contribution;

	private double count;
	private int rate;
	private int utilization;
	private int margin;
	private int gst;
	private int gstAmount;
	private boolean enabled = true;

}
