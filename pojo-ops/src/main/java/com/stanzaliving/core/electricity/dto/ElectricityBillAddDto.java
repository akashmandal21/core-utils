package com.stanzaliving.core.electricity.dto;

import java.time.LocalDate;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import org.springframework.format.annotation.DateTimeFormat;

import com.stanzaliving.core.electricity.constants.ElectricityBillType;

import lombok.AllArgsConstructor;
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
@AllArgsConstructor
public class ElectricityBillAddDto {
	
	@NotBlank(message = "ResidenceId Cannot be blank")
	private String residenceId;
	
	private String propertyId;

	private String billNumber;
	
	private String billUuid;
	
	private String billUrl;
	
	private String billPath;

	@NotNull(message = "ElectricityBillType Cannot be null")
	private ElectricityBillType electricityBillType;

	@NotNull(message = "BillDurationFrom Cannot be null")
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate billDurationFrom;

	@NotNull(message = "BillDurationTo Cannot be null")
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate billDurationTo;

	@NotNull(message = "ConsumptionCharges Cannot be null")
	private Double consumptionCharges;
	
	@NotNull(message = "TotalCharges Cannot be null")
	private Double totalCharges;
	
	@Builder.Default
	private Double otherCharges = 0d;
	
	@Builder.Default
	private Double panaltyCharges = 0d;
	
	@Builder.Default
	private Double arrearsCharges = 0d;
	
	@NotNull(message = "Grid supply units cannot be null")
	private Double gridUnits;
	
	@Builder.Default
	private Double dgUnits = 0d;
	
	@Builder.Default
	private Double gridUnitRate = 1d;
	
	@Builder.Default
	private Double dgUnitRate = 1d;
	
	@Builder.Default
	private Boolean forceSubmit = false;
	
}