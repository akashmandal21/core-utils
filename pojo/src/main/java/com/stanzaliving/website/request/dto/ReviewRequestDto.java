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
	
	private boolean status;
	
	private String residentName;

	private String residenctImage;
	
	private String reviewText;
	
	private PropertyEntityType reviewType;
	
	private Date reviewDate;
	
	private Integer position;
	
	@Builder.Default
	private Boolean isForSpecificLocations = false;
	
	private SpecificLocationsDto specificLocationsDto;
}
