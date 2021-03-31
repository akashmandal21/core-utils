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
public class ResidenceFilteredResponseDTO {

	@Builder.Default
	private List<ResidenceResponseDTO> residenceResponseShortDTOs = new ArrayList<>();
	
	@Builder.Default
	private Integer residenceCount = 0;

}
