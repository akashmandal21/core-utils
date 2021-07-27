package com.stanzaliving.website.response.dto;

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
public class ImageGroupedByTagsResponseDTO {
	
	Map<String, List<ImageResponseDTO>> imagesTagMap;
}
