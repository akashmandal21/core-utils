package com.stanzaliving.estimators.dto;

import com.stanzaliving.estimators.enums.AssumptionSource;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class EstateLevelVariablesDto {

	private long id;
	
	private long cityId;

	private String cityName;
	
	private long microMarketId;

	private String microMarketName;
	
	private String name;
	
	private String key;

	private AssumptionSource source;

	private double value;	
	
}
