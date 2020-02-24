package com.stanzaliving.locator.dto;

import java.util.List;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class LocatorEstateViewDto {

	private List<InstitutionDto> institutions;
	
	private List<Competitor> competitors;
	
	private List<TechParks> techParks;
	
	private List<StanzaPropertyDto> stanzaProperties;
	
}
