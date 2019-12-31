package com.stanzaliving.core.operations.dto.serviceset.housekeeping;

import java.util.List;

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
public class HouseKeepingResidenceDto {

	private ResidenceType residenceType;

	private List<HouseKeepingDto> houseKeepingDtos;

	private List<HouseKeepingBrandServiceDto> brandDetails;
}