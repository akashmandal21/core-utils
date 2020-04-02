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
public class BedAttributesFilter {

	private BedCountRange bedCountRange;
	private RentBedRange rentBedRange;
}
