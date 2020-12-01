package com.stanzaliving.website.request.dto;

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
public class FlatUrlRequestDTO {
	private int flatUrlId;
	private String url;
	private String name;
	private int placeId;
	private String description;
	private String seoTitle;
	private String seoDescription;
}
