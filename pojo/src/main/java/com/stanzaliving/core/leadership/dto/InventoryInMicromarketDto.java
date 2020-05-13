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
public class InventoryInMicromarketDto {

	private InventoryAttributes l1Approved;
	private InventoryAttributes live;
	private InventoryAttributes locked;
}
