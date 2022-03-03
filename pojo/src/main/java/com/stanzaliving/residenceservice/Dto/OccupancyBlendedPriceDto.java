/**
 * 
 */
package com.stanzaliving.residenceservice.Dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author raj.kumar
 *
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class OccupancyBlendedPriceDto implements Serializable {

	private Integer occupancy;
	private String occupancyName;
	private Integer bedCount;
	private double blendedPrice;
	private double minimumPrice;
	private double maximumPrice;
}
