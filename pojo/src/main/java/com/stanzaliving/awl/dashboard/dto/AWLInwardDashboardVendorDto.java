package com.stanzaliving.awl.dashboard.dto;

import java.io.Serializable;
import java.util.Map;

import lombok.AllArgsConstructor;
import lombok.Builder;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AWLInwardDashboardVendorDto implements Serializable {
	private static final long serialVersionUID = 11213252332L;
	private String vendorName;
	private String vendorCode;

	private Map<String, Map<String, AWLDashboardCountDto>> categotyData; // Zone Name,WareHouseName

}
