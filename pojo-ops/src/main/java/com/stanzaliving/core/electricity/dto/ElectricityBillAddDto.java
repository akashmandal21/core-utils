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

	@NotBlank(message = "PropertyCode Cannot be blank")
	private String propertyCode;
	
	@NotBlank(message = "ResidenceId Cannot be blank")
	private String residenceId;

	private String billNumber;
	
	private String billUuid;

	@NotBlank(message = "ElectricityBillType Cannot be blank")
	private ElectricityBillType electricityBillType;

	@NotBlank(message = "BillDurationFrom Cannot be blank")
	private Date billDurationFrom;

	@NotBlank(message = "BillDurationTo Cannot be blank")
	private Date billDurationTo;

	@NotBlank(message = "ConsumptionCharges Cannot be blank")
	private double consumptionCharges;
	
	@Default
	private double otherCharges = 0;
	
	@Default
	private double panaltyCharges = 0;
	
	@Default
	private double arrearsCharges = 0;
	
	@NotBlank(message = "Grid supply units cannot be blank")
	private double gridUnits;
	
	@Default
	private double dgUnits = 0;
	


}