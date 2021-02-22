package com.stanzaliving.core.operations.dto;

import java.util.List;

import javax.validation.constraints.NotNull;

import com.stanzaliving.operations.enums.ServiceMixStatus;

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
public class ServiceMixCopyToRequestDto {
	
	@NotNull(message = "dealId can't be null")
	private String dealId;
	
	@NotNull(message = "copyFromServiceMixUuid can't be null")
	private String copyFromServiceMixUuid;
	
	@NotNull(message = "destinationResidenceUuid can't be null")
	private List<String> destinationResidenceUuid;
	
	@NotNull(message = "action can't be null")
	private ServiceMixStatus action;
}
