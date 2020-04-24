package com.stanzaliving.locator.dto;

import lombok.*;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class CityStateDto {
	private String city;

	private String state;
}
