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
public class ItemTypeUserPreferenceCountDto {

	private String preferredMenu;

	@Builder.Default
	private Integer veg = 0;

	@Builder.Default
	private Integer nonveg = 0;

}