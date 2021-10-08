package com.stanzaliving.core.electricity.dto;


import java.time.LocalDate;
import java.util.List;

import javax.validation.constraints.NotNull;

import org.springframework.format.annotation.DateTimeFormat;

import com.stanzaliving.core.base.enums.AccessLevel;
import com.stanzaliving.core.common.SortingType;
import com.stanzaliving.core.electricity.constants.ElectricityBillSearchSortingField;
import com.stanzaliving.core.electricity.constants.ElectricityBillStatus;

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

	// All Property Bill Search Fields
	@NotNull(message = "AccessLevel is mandatory")
	private AccessLevel accessLevel;
	private String cityId;
	private String microMarketId;
	private String societyId;
	private String propertyId;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate fromDate;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate toDate;
	private List<String> tagIds;
	private SortingType sortingType;
	private ElectricityBillSearchSortingField sortingField;
	
	// Selected Property Bill Search Fields
	private String billType;
	private String billNumber;
	private ElectricityBillStatus billStatus;
}
