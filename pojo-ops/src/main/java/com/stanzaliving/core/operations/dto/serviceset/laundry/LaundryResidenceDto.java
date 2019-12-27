package com.stanzaliving.core.operations.dto.serviceset.laundry;

import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.List;

import com.stanzaliving.core.enums.ResidenceType;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
public class LaundryResidenceDto {

	private ResidenceType residenceType;

	private List<LaundryDto> laundryDtos;

	private List<LaundryBrandDetailDto> laundryBrandDetailDtos;

}