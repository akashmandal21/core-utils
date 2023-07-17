package com.stanzaliving.core.electricity.dto;


import java.time.LocalDate;

import javax.validation.constraints.Min;

import org.springframework.format.annotation.DateTimeFormat;

import com.stanzaliving.core.common.SortingType;
import com.stanzaliving.core.electricity.constants.ElectricityBillRequestStatusFilter;
import com.stanzaliving.core.electricity.constants.ElectricityBillSearchSortingField;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
public class ElectricityBillSearchRequestDto {

	@Builder.Default
	@Min(value = 1, message = "Page no cannot be less than 1")
	private int pageNo = 1;
	@Builder.Default
	@Min(value = 1, message = "Limit cannot be be less than 1")
	private int limit = 50;
	
	@Builder.Default
	private ElectricityBillRequestStatusFilter quickFilter = ElectricityBillRequestStatusFilter.ALL;
	private String cityId;
	private String microMarketId;
	private String societyName;
	private String propertyId;
	private String residenceId;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate fromDate;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate toDate;
	private SortingType sortingType;
	private ElectricityBillSearchSortingField sortingField;

	@Builder.Default
	private Boolean approvalDashBoard = false;

}
