package com.stanzaliving.locator.dto;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LocatorEstateViewDto {

	private List<InstitutionDto> institutions;
	
	private List<Competitor> competitors;
	
	private List<TechParks> techParks;
}
