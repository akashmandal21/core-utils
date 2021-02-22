package com.stanzaliving.core.operations.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import java.util.List;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
public class ServiceMixResidenceDto {

	List<ResidenceDetailsDto> residenceDetailsDtoList;
	List<ServiceMixDetailsDto> serviceMixDetailsDtoList;


}
