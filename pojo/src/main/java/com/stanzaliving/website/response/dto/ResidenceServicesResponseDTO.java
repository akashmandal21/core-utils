/**
 * @author nipunaggarwal
 *
 */
package com.stanzaliving.website.response.dto;

import java.util.List;

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
public class ResidenceServicesResponseDTO {

	private ResidenceResponseDTO residenceResponseDTO;
	private List<VasDetailResidenceResponseDTO> vasList;
	private List<AmenitiesResidenceResponseDTO> amenitiesList;
	private List<PackagedServiceDetailResidenceResponseDTO> packagedServicesList;

}
