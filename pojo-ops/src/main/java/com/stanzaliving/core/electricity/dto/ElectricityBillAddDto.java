package com.stanzaliving.core.electricity.dto;

import java.time.LocalDate;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import com.stanzaliving.core.electricity.constants.ElectricityBillType;

import lombok.AllArgsConstructor;
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
@AllArgsConstructor
public class ElectricityBillAddDto {

	@NotBlank(message = "PropertyCode Cannot be blank")
	private String propertyCode;
	
	@NotBlank(message = "ResidenceId Cannot be blank")
	private String residenceId;

	private String billNumber;
	
	private String billUuid;

	@NotNull(message = "ElectricityBillType Cannot be blank")
	private ElectricityBillType electricityBillType;

	@NotNull(message = "BillDurationFrom Cannot be blank")
	private LocalDate billDurationFrom;

	@NotNull(message = "BillDurationTo Cannot be blank")
	private LocalDate billDurationTo;

	@NotNull(message = "ConsumptionCharges Cannot be null")
	private Double consumptionCharges;
	
	@NotNull(message = "TotalCharges Cannot be null")
	private Double totalCharges;
	
	@Default
	private Double otherCharges = 0d;
	
	@Default
	private Double panaltyCharges = 0d;
	
	@Default
	private Double arrearsCharges = 0d;
	
	@NotNull(message = "Grid supply units cannot be blank")
	private Double gridUnits;
	
	@Default
	private Double dgUnits = 0d;

}