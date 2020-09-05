package com.stanzaliving.transformations.ui.pojo;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class City {

	private String cityName;
	
	private Long id;
	
	private String uuid;

	private List<MicroMarket> microMarkets;
}
