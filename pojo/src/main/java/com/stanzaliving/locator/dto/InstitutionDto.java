package com.stanzaliving.locator.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class InstitutionDto {

	private String name;
	private String cityName;
	private Double latitude;
	private Double longitude;
	private String gender;
	private Long studentEnrollmentCount;
	private Double distance;
}
