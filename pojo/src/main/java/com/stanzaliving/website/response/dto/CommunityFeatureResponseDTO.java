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

/**
 * @author nipunaggarwal
 *
 */
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class CommunityFeatureResponseDTO {

	private int communityFeatureId;
	private String name;
	private String iconImageUrl;
	private boolean enabled;
	private String iconImageUrlAltTag;

}
