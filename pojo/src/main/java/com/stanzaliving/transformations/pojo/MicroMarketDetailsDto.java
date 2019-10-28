package com.stanzaliving.transformations.pojo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class MicroMarketDetailsDto {

	private MicroMarketUIDto microMarketUIDto;
	
	private String address;
}
