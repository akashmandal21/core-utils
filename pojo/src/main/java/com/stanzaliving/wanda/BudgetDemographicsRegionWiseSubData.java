package com.stanzaliving.wanda;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Builder
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Getter
@ToString
public class BudgetDemographicsRegionWiseSubData {

	private String residenceName;
	private String residenceUuid;
	private int mir;
	private List<BudgetDemographicsRegionWiseData> regionData;

}
