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
public class SeoDetailsRequestDTO {
	private int residenceId;
	private int cityId;
	private int micromarketId;
	private String description;
	private String seoTitle;
	private String seoDescription;
	private String slug;
	
	
}
