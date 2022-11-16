/**
 * @author nipunaggarwal
 *
 */
package com.stanzaliving.website.response.dto;

import java.io.Serializable;
import java.util.Comparator;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author nipunaggarwal
 *
 */
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class FacilityResponseDTO implements Serializable, Comparator<FacilityResponseDTO> {
	
	private static final long serialVersionUID = 1L;

	private int facilityId;
	private String name;
	private String iconImageUrl;
	private boolean enabled;
	private String facilityImgUrl;
	private Integer sequenceId;
	private String iconImageUrlAltTag;

	public int compare(FacilityResponseDTO object1, FacilityResponseDTO object2) {

		if (object1.getSequenceId() > object2.getSequenceId())
			return 1;
		else
			return 0;
	}
}
