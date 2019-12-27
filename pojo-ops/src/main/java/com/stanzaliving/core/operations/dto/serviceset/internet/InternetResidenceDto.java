package com.stanzaliving.core.operations.dto.serviceset.internet;

import java.util.List;

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

	private InternetDto internetDto;

	private List<InternetBrandDetailDto> internetBrandDetailDtos;
}