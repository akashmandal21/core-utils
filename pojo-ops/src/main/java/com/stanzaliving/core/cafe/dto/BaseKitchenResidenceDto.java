package com.stanzaliving.core.cafe.dto;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class BaseKitchenResidenceDto {

	private String baseKitchenId;

	private String baseKitchenName;

	private List<ResidenceMicromarketDto> residences;

}