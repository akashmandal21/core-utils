/**
 * 
 */
package com.stanzaliving.residenceservice.Dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author raj.kumar
 *
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class OccupancyBlendedPriceDto {

	private Integer occupancy;
	private String occupancyName;
	private Integer bedCount;
	private double blendedPrice;
}
