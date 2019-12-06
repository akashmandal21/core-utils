package com.stanzaliving.transformations.pojo;

import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Builder
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class CountryUIDto {

	private Long id;

	private String uuid;

	@NotNull
	private String countryName;

	@NotNull
	private String currency;

	@NotNull
	private String localization;

	private boolean status;
}