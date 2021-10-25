package com.stanzaliving.core.electricity.dto;


import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;

import com.stanzaliving.core.common.SortingType;
import com.stanzaliving.core.electricity.constants.ElectricityBillRequestStatusFilter;
import com.stanzaliving.core.electricity.constants.ElectricityBillSearchSortingField;

import lombok.Builder.Default;
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
	
	private int pageNo;
	private int limit;
	
	@Default
	private ElectricityBillRequestStatusFilter quickFilter = ElectricityBillRequestStatusFilter.ALL;
	private String cityId;
	private String microMarketId;
	private String societyName;
	private String propertyCode;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate fromDate;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate toDate;
	private SortingType sortingType;
	private ElectricityBillSearchSortingField sortingField;
	
}
