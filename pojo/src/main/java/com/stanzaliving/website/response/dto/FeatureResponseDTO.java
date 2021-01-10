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
public class FeatureResponseDTO {

	private int featureId;
	private String name;
	private String iconImageUrl;
	private boolean enabled;
	private String featureImgUrl;
	private Integer sequenceId;
	private String iconImageUrlAltTag;

}
