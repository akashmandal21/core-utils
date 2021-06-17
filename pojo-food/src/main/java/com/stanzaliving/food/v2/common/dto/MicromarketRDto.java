package com.stanzaliving.food.v2.common.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import java.io.Serializable;
import java.util.List;

@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
public class MicromarketRDto implements Serializable {
	private String mmId;
	private String name;
	private List<ResidenceRDto> residences;
	
}
