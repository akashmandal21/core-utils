package com.stanzaliving.wanda;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Builder
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Getter
public class BudgetDemographicsData {

	private String eventName;
	private int mir;
	private List<BudgetDemographicsRegionWiseData> regionData;
	private List<BudgetDemographicsRegionWiseSubData> subData;

}
