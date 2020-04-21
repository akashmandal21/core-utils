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
public class AWLInwardDashboardItemDto implements Serializable {

	private static final long serialVersionUID = 11213252332L;
	private String itemCode;
	private String itemName;

	public List<AWLInwardDashboardVendorDto> vendors;
	private Map<String, Map<String, AWLDashboardCountDto>> categotyData; // Zone Name,WareHouseName

}
