/**
 * @author nipunaggarwal
 *
 */
package com.stanzaliving.website.response.dto;

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
public class MicromarketResidenceCountResponseDTO {

	private Integer residenceCount;
	private Integer apartmentCount;
	
	private Integer micromarketId;
	private String micromarketName;
	private String micromarketSlug;
	private String apartmentMMSlug;
	
	private Integer cityId;
	private String cityName;
	private String citySlug;
	private String apartmentCitySlug;

}
