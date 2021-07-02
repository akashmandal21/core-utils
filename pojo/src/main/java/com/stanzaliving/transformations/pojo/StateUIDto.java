package com.stanzaliving.transformations.pojo;


import javax.validation.constraints.NotNull;

import com.stanzaliving.transformations.enums.TimeZone;

import lombok.*;

@Getter
@Setter
@ToString
@EqualsAndHashCode
public class StateUIDto {

	private String uuid;
	
	private long id;
	
	@NotNull
	private String stateName;
	
	@NotNull
	private String countryName;
	
	@NotNull
	private TimeZone timeZone;
	
	private boolean status;
	
	private long countryId;
}
