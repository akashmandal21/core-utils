package com.stanzaliving.wanda;

import com.stanzaliving.core.food.enums.DemoGraphicsRegion;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Builder
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Getter
@ToString
public class BudgetDemographicsRegionWiseData {

	private String regionName;
	private DemoGraphicsRegion demoGraphicsRegion;
	private int preferenceCount;
	private int preferencePercentage;

}
