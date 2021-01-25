/**
 * 
 */
package com.stanzaliving.sfr;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author raj.kumar
 *
 */
@Getter
@Setter
@ToString
public class SfrReportSummaryDto {

	private int totalBed;
	private int totalRoom;
	private int acCount;
	private int attachedToiletCount;
	private int geyserCount;
	private int attachedBalconyCount;
	private String cafeteriaPreferredLocation;
}
