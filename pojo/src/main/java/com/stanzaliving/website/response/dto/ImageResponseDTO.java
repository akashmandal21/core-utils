/**
 * @author nipunaggarwal
 *
 */
package com.stanzaliving.website.response.dto;

import java.util.Map;

import com.stanzaliving.website.enums.ImageTags;

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
public class ImageResponseDTO {

	private int imageId;
	private String imageUrl;
	private String imageType;
	private int imageOrder;
	private boolean enabled;
	private String altTag;
	private Map<ImageTags, String> imageTag;
	private boolean featuredImage;
}
