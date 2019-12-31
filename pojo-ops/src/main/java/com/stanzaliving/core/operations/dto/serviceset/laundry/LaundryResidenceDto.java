package com.stanzaliving.core.operations.dto.serviceset.laundry;

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
public class LaundryResidenceDto {

	private ResidenceType residenceType;

	private List<LaundryDto> laundryDtos;

	private List<LaundryBrandServiceDto> brandDetails;

}