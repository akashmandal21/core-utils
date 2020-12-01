package com.stanzaliving.website.request.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class MicromarketRequestDTO {

	private int micromarketId;
	private String name;
	private double latitude;
	private double longitude;
	private String phone;

}
