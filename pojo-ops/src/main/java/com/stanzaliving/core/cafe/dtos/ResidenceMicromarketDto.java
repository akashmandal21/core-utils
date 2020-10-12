package com.stanzaliving.core.cafe.dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class ResidenceMicromarketDto {
	private String residenceId;

	private String residenceName;
	
	private String micromarketId;

	private String micromarketName;

	private boolean enabled;



}