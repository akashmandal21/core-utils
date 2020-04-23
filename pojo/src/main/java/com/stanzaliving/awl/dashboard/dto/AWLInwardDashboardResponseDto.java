package com.stanzaliving.awl.dashboard.dto;

import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.Set;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AWLInwardDashboardResponseDto implements Serializable {

	private static final long serialVersionUID = 1232123332L;

	private Map<String, Map<String, AWLDashboardCountDto>> overallData;
	private List<AWLInwardDashboardItemCategoryDto> dashboardRecords;

	private Set<String> cities;
	private Set<String> wareHouses;
	private Map<String, Set<String>> cityWiseWarehouses;

}
