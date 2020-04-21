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
public class AWLInwardDashboardItemCategoryDto implements Serializable {

	
	private static final long serialVersionUID = 11213252123332L;

	private List<AWLInwardDashboardItemDto> items;

	private String itemCategoryName; // such as GYM equipments,Loose furniture
	private String itemCategoryCode;
	private Map<String, Map<String, AWLDashboardCountDto>> categotyData; // Zone Name,WareHouseName

	
}
