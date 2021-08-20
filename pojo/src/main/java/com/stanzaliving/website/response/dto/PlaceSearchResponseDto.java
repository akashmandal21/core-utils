package com.stanzaliving.website.response.dto;

import java.util.List;

import com.stanzaliving.website.elasticsearch.index.dto.WebsitePlaceIndexDto;

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
public class PlaceSearchResponseDto {

	private Integer searchDetailId;
	
	private List<WebsitePlaceIndexDto> results;
}
