package com.stanzaliving.transformations.pojo;

import javax.validation.constraints.NotNull;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@EqualsAndHashCode
public class CountryUIDto {

	private String uuid;
	
	private long id;
	
	@NotNull
	private String countryName;
	
	@NotNull
	private String currency;
	
	@NotNull
	private String localization;

	private boolean status;
}
