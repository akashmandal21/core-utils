package com.stanzaliving.website.request.dto;

import java.util.Date;

import com.stanzaliving.core.enums.PropertyEntityType;
import com.stanzaliving.website.dto.SpecificLocationsDto;

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
public class ReviewRequestDto {

	private Long id;
	
	@Builder.Default
	private boolean status = true;
	
	private String residentName;

	private String residentImage;
	
	private String reviewText;
	
	private PropertyEntityType reviewType;
	
	private Date reviewDate;
	
	private Integer position;
	
	@Builder.Default
	private Boolean isForSpecificLocations = false;
	
	private SpecificLocationsDto specificLocationsDto;
}
