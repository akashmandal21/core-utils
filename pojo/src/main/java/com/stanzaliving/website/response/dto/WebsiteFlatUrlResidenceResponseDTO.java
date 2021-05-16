package com.stanzaliving.website.response.dto;

import java.util.ArrayList;
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
	
	@Builder.Default
	private List<ResidenceResponseShortDTO> residenceResponseShortDTOs = new ArrayList<>();
	
	private int count;
}
