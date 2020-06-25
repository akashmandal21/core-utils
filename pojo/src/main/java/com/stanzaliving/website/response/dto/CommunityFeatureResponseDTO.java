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
public class CommunityFeatureResponseDTO {

	private int communityFeatureId;
	private String name;
	private String iconImageUrl;
	private boolean enabled;
	private String iconImageUrlAltTag;

}
