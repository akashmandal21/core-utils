package com.stanzaliving.core.electricity.dto;


import java.time.LocalDate;
import java.util.List;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

import org.springframework.format.annotation.DateTimeFormat;

import com.stanzaliving.approval.enums.ApprovalStatus;
import com.stanzaliving.core.common.SortingType;
import com.stanzaliving.core.electricity.constants.ApartmentElectricityBillSortingField;
import com.stanzaliving.core.electricity.constants.ApartmentElectricityBillStatusFilter;
import com.stanzaliving.core.electricity.constants.ElectricityBillStatus;
import com.stanzaliving.core.electricity.constants.ElectricityBillType;

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
public class ApartmentElectricityBillRequestDto {
	
	@Builder.Default
	@Min(value = 1, message = "Page no cannot be less than 1")
	private int pageNo = 1;
	@Builder.Default
	@Min(value = 1, message = "Limit cannot be less than 1")
	private int limit = 50;

	private String propertyCode;
	
	@NotBlank(message = "ResidenceId can not be blank")
	private String residenceId;
	
	private ElectricityBillType electricityBillType;
	
	private ElectricityBillStatus electricityBillStatus;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate fromDate;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate toDate;
	private String billNumber;
	
	@Builder.Default
	private ApartmentElectricityBillStatusFilter quickFilter = ApartmentElectricityBillStatusFilter.ALL;
	private SortingType sortingType;
	private ApartmentElectricityBillSortingField sortingField;
	
	private List<ApprovalStatus> approvalStatus;
	
	@Builder.Default
	private Boolean approvalDashBoard = false;
	
}
