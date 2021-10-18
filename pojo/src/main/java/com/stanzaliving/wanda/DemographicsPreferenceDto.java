package com.stanzaliving.wanda;

import com.stanzaliving.core.food.enums.DemoGraphicsRegion;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Builder
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Getter
public class DemographicsPreferenceDto {

	private DemoGraphicsRegion demoGraphicsRegion;
	private String demographicsRegionName;
	private Integer preferenceCount;
	private Integer preferencePercentage;

}
