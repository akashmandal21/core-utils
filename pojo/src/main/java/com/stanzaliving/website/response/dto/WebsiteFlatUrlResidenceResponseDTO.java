package com.stanzaliving.website.response.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class WebsiteFlatUrlResidenceResponseDTO extends WebsitePlaceNearByPropertiesResponseDTO {

	private WebsiteFlatUrlResponseDTO flatUrlResponseDTO;
}
