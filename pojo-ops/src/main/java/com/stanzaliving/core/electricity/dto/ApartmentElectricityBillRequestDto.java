package com.stanzaliving.core.electricity.dto;


import java.time.LocalDate;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import org.springframework.format.annotation.DateTimeFormat;

import com.stanzaliving.approval.enums.ApprovalStatus;
import com.stanzaliving.core.base.enums.AccessLevel;
import com.stanzaliving.core.common.SortingType;
import com.stanzaliving.core.electricity.constants.ApartmentElectricityBillSortingField;
import com.stanzaliving.core.electricity.constants.ApartmentElectricityBillStatusFilter;
import com.stanzaliving.core.electricity.constants.ElectricityBillType;

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
public class ApartmentElectricityBillRequestDto {
	
	private int pageNo;
	private int limit;

	@NotBlank
	private String propertyCode;
	
	private ElectricityBillType electricityBillType;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate fromDate;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate toDate;
	private ApprovalStatus approvalStatus;
	private String billNumber;
	
	@Default
	private ApartmentElectricityBillStatusFilter quickFilter = ApartmentElectricityBillStatusFilter.ALL;
	private SortingType sortingType;
	private ApartmentElectricityBillSortingField sortingField;
	
	@NotNull(message = "AccessLevel is mandatory")
	private AccessLevel accessLevel;
}
