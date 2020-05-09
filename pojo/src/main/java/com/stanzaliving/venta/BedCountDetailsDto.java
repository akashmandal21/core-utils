/**
 * 
 */
package com.stanzaliving.venta;

import lombok.Getter;
import lombok.ToString;
import lombok.Setter;

/**
 * @author raj.kumar
 *
 */
@Getter
@Setter
@ToString
public class BedCountDetailsDto {

	private String micromarketName;
	private String residenceName;
	private int totalInventory;
	private int deadInventory;
	private int blockedInventory;
	private int occupiedInventory;
	private int availableInventory;
}
