package com.stanzaliving.website.request.dto;

import java.util.List;

import com.stanzaliving.website.response.dto.FlatUrlPlaceResponseDTO;

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
	private List<FlatUrlPlaceResponseDTO> placeData;
	private String description;
	private String name;
	private String seoTitle;
	private String seoDescription;
}
