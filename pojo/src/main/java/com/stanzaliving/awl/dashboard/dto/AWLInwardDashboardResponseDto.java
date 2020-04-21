package com.stanzaliving.awl.dashboard.dto;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

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

	private List<String> cities;
	private List<String> wareHouses;
	private Map<String, List<String>> cityWiseWarehouses;

}
