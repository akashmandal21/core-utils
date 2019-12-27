package com.stanzaliving.core.operations.dto.serviceset.internet;

import java.util.List;
import java.util.Map;

import com.stanzaliving.core.enums.ResidenceBrand;
import com.stanzaliving.core.enums.ResidenceType;

import lombok.*;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
public class InternetResidenceDto {

	private ResidenceType residenceType;

	private List<InternetDto> internetDtos;

	private Map<ResidenceBrand, List<InternetBrandDetailDto>> brandDetailsMap;
}