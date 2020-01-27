/**
 * @author nipunaggarwal
 *
 */
package com.stanzaliving.website.response.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author nipunaggarwal
 *
 */
@Getter
@Setter
@ToString
public class ImageResponseDTO {

	private int imageId;
	private String imageUrl;
	private String imageType;
	private int imageOrder;
	private boolean enabled;

}
