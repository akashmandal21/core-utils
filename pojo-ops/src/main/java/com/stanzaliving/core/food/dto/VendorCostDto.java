/**
 * 
 */
package com.stanzaliving.core.food.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * @author naveen.kumar
 *
 * @date 13-Jun-2020
 *
 **/
@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class VendorCostDto {

	private Double vegCost;

	private Double nonVegCost;

	private Double nonStanzaStaffCost;

	private Double deltaVeg;
	
	private Double deltaNonVeg;
	
	private Double deltaNonStanzaStaffVeg;
}