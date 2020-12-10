package com.stanzaliving.website.response.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class MediaResponseDTO {

	private int mediaId;
	private String title;
	private String image;
	private String description;
	private String url;
	private boolean featured;
	private String source;
	private int position;
	private String date;
	private boolean enabled;

}
