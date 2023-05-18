package com.stanzaliving.core.food.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
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
public class InputPaxDto {

	@Builder.Default
	private Integer vegPax = 0;

	@Builder.Default
	private Integer nonVegPax = 0;

	@Builder.Default
	private Integer stanzaStaffVegPax = 0;

	@Builder.Default
	private Integer stanzaStaffNonVegPax = 0;

	@Builder.Default
	private Integer nonSlStaffVegPax = 0;

}
