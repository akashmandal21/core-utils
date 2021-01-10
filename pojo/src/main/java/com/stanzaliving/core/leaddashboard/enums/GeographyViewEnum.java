/**
 * 
 */
package com.stanzaliving.core.leaddashboard.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author raj.kumar
 *
 */
@Getter
@AllArgsConstructor
public enum GeographyViewEnum {

	CITY("City", 0),
	MICROMARKET("Micromarket", 1),
	RESIDENCE("Residence", 2),
	LEAD("Lead", 3);
	
	private String geographyViewText;
	private int level;
}
