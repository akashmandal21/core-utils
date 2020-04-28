package com.stanzaliving.awl.dashboard.dto;

import java.io.Serializable;

import javax.validation.constraints.NotEmpty;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AWLInwardDashboardFilterDto implements Serializable {

	private static final long serialVersionUID = 11213123252332L;
	
	private String vendorCode;
	private String itemCategoryCode;
	private String fromDate;
	private String toDate;
	
	
	@NotEmpty(message = "Data fetch level can't be empty.")
	private String dataFetchLevel;//such as itemCategory,item
}
