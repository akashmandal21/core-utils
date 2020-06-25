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
public class FeatureResponseDTO {

	private int featureId;
	private String name;
	private String iconImageUrl;
	private boolean enabled;
	private String featureImgUrl;
	private Integer sequenceId;
	private String iconImageUrlAltTag;

}
