/**
 * @author nipunaggarwal
 *
 */
package com.stanzaliving.website.response.dto;

import java.io.Serializable;
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
public class FeatureResponseDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	private int featureId;
	private String name;
	private String iconImageUrl;
	private boolean enabled;
	private String featureImgUrl;
	private Integer sequenceId;
	private String iconImageUrlAltTag;
	private List<String> dynamicUrlSlugs;
	private String seoTitle;
	private String seoDescription;
	private String seoContent;
	private String seoFaq;
}
