package com.stanzaliving.core.operations.dto.serviceset.transport;

import java.util.List;
import java.util.Map;

import com.stanzaliving.core.enums.ResidenceBrand;
import com.stanzaliving.core.enums.ResidenceType;

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
public class TransportResidenceDto {

	private ResidenceType residenceType;

	private List<TransportDto> transportDtos;

	private Map<ResidenceBrand, List<TransportBrandDetailDto>> brandDetailsMap;

}