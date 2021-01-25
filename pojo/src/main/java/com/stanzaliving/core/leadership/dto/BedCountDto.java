/**
 * 
 */
package com.stanzaliving.core.leadership.dto;

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
public class BedCountDto {

	private int liveBedCount;
	private int lockedBedCount;
	private int l1ApprovedBedCount;
}
