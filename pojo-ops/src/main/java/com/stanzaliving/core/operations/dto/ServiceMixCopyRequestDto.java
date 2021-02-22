package com.stanzaliving.core.operations.dto;

import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;


@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
public class ServiceMixCopyRequestDto {
	
	@NotNull(message = "copyFromServiceMixUuid can't be null")
	private String copyFromServiceMixUuid;
	
	private String copyToServiceMixUuid;
	
	@NotNull(message = "destinationResidenceUuid can't be null")
	private String destinationResidenceUuid;
	
}
