package com.stanzaliving.website.response.dto;

import java.util.Map;
import java.util.Set;

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
	
	Map<String, Set<ImageResponseDTO>> imagesTagMap;
}
