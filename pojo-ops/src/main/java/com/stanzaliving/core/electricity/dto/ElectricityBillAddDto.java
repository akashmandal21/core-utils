package com.stanzaliving.core.electricity.dto;

import java.util.Date;

import javax.validation.constraints.NotBlank;

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

	@NotBlank(message = "PropertyId Cannot be blank")
	private String propertyId;
	
	@NotBlank(message = "ResidenceId Cannot be blank")
	private String residenceId;

	@NotBlank(message = "BillNumber Cannot be blank")
	private String billNumber;

	@NotBlank(message = "ElectricityBillType Cannot be blank")
	private ElectricityBillType electricityBillType;

	@NotBlank(message = "BillStartDate Cannot be blank")
	private Date billStartDate;

	@NotBlank(message = "BillEndDate Cannot be blank")
	private Date billEndDate;

	@NotBlank(message = "ConsumptionCharges Cannot be blank")
	private double consumptionCharges;
	
	@Default
	private double otherCharges = 0;
	
	@Default
	private double panaltyCharges = 0;
	
	@Default
	private double arrearsCharges = 0;
	
	@NotBlank(message = "Grid supply units cannot be blank")
	private double gridSupplyUnits;
	
	@Default
	private double dgSupplyUnits = 0;
	


}