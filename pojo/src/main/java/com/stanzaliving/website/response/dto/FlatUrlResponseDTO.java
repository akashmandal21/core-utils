package com.stanzaliving.website.response.dto;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
public class FlatUrlResponseDTO {
	private int flatUrlId;
	private String url;
	private String name;
	private String description;
	private String seoTitle;
	private String seoDescription;
	private List<FlatUrlPlaceResponseDTO> placeData;
	private boolean isActive;
	
}
