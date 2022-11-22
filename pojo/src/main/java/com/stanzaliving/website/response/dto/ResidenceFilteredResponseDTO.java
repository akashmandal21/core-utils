package com.stanzaliving.website.response.dto;

import java.util.ArrayList;
import java.util.List;

import com.stanzaliving.core.base.common.dto.PageResponse;
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
public class ResidenceFilteredResponseDTO extends PageResponse<ResidenceFilteredResponseDTO> {

	private static final long serialVersionUID = 1L;

	@Builder.Default
	private List<ResidenceResponseShortDTO> residenceResponseShortDTOs = new ArrayList<>();
	
	@Builder.Default
	private Integer residenceCount = 0;
	
	@Builder.Default
	private Integer apartmentCount = 0;
	
	private WebsitePlaceIndexDto placeIndexDto;
}
