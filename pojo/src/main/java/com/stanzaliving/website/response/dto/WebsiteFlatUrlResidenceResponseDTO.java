package com.stanzaliving.website.response.dto;

import java.util.List;

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
public class WebsiteFlatUrlResidenceResponseDTO {

	private WebsiteFlatUrlResponseDTO flatUrlResponseDTO;
	
	private List<ResidenceResponseShortDTO> residenceResponseShortDTOs;
	
	private List<ApartmentResponseDto> apartments;
	
	private int count;
}
