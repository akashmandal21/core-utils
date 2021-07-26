package com.stanzaliving.food.v2.menu.dto;

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
public class ResidenceFoodMenuItemIdProjectionDto {
	String residenceFoodMenuId;
	String itemId;
}
