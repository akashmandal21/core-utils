package com.stanzaliving.website.request.dto;

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
public class ResidenceSeoDetailsRequestDTO {

	private int residenceId;
	private String description;
	private String seoTitle;
	private String seoDescription;
	private String slug;

}
