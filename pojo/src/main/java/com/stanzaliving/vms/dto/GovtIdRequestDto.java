package com.stanzaliving.vms.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class GovtIdRequestDto {

	@NonNull
	private String govtIdType;
	@NonNull
	private String govtIdImage;
	@NonNull
	private String govtIdNumber;
	@NonNull
	private Boolean primary;
	
	private String employeeId;
	
}