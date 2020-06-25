/**
 * @author nipunaggarwal
 *
 */
package com.stanzaliving.website.response.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

/**
 * @author nipunaggarwal
 *
 */
@Builder
@AllArgsConstructor
@Getter
public class FacilityResponseDTO {
	
	private int facilityId;
	private String name;
	private String iconImageUrl;
	private boolean enabled;
	private String facilityImgUrl;
	private Integer sequenceId;
	private String iconImageUrlAltTag;

}
