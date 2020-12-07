/**
 * @author nipunaggarwal
 *
 */
package com.stanzaliving.website.request.dto;

import java.util.HashSet;
import java.util.Set;

import com.stanzaliving.website.response.dto.ResidenceOccupancyResponseDTO;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * @author nipunaggarwal
 *
 */
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class ResidenceOccupancyRequestDTO {

	private int residenceId;
	private int startingPrice;
	private String pricingPlan;

	@Builder.Default
	private Set<ResidenceOccupancyResponseDTO> residenceOccupancies = new HashSet<>(0);

}
