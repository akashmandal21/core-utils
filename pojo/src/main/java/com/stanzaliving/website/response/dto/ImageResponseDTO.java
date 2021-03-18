/**
 * @author nipunaggarwal
 *
 */
package com.stanzaliving.website.response.dto;

import java.io.Serializable;
import java.util.List;

import com.stanzaliving.core.user.enums.EnumListing;
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
public class ImageResponseDTO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int imageId;
	private String imageUrl;
	private String imageType;
	private int imageOrder;
	private boolean enabled;
	private String altTag;
	private List<EnumListing<ImageTags>> imageTag;
	private boolean featuredImage;
	private String imageUrlAltTag;
	private List<String> imageUrlAltTagList;
}
