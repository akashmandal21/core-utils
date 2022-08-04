package com.stanzaliving.website.response.dto;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class ApartmentLandingPageResponse {

	private String message;
	private List<ApartmentResponseDto> apartmentResponseDto;
}
