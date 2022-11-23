package com.stanzaliving.website.request.dto;

import com.stanzaliving.website.enums.ImageTags;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class ImageRequestDTO {

	private int imageId;
	private int residenceId;
	private String imageUrl;
	private String imageType;
	private int imageOrder;
	private boolean enabled;
	private String altTag;
	private ImageTags imageTag;
	private String imageTagstatus;
	private boolean featuredImage;
}
