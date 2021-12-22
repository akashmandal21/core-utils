package com.stanzaliving.core.electricity.dto;

import java.util.Date;
import java.util.List;
import java.util.Map;

import com.stanzaliving.approval.enums.ApprovalStatus;
import com.stanzaliving.core.base.common.dto.AbstractDto;
import com.stanzaliving.core.electricity.constants.ElectricityBillStatus;
import com.stanzaliving.core.electricity.constants.ElectricityBillType;
import com.stanzaliving.core.enums.ApartmentType;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@ToString(callSuper = true)
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class ElectricityBillDto extends AbstractDto {

	private static final long serialVersionUID = 6801852116636272900L;

	private String residenceId;

	private String propertyCode;
	
	private String propertyName;

	private ApartmentType apartmentType;
	
	private String apartmentTypeName;
	
	private String propertyAddressLine1;
	
	private String propertyAddressLine2;
	
	private String cityName;
	
	private String cityId;
	
	private String micromarketName;
	
	private String micromarketId;
	
	private String billNumber;

	private ElectricityBillType electricityBillType;
	
	private String electricityBillTypeName;
	
	private Date billDurationFrom;
	
	private Date billDurationTo;

	private String billUrl;
	
	private String billPath;
	
	private Double totalCharges;

	private Double consumptionCharges;

	private Double gridConsumptionCharges;

	private Double dgConsumptionCharges;

	private Double otherCharges;

	private Double panaltyCharges;
	
	private Double arrearsCharges;

	private Double totalUnits;

	private Double dgUnits;

	private Double gridUnits;

	private Double dgUnitRate;

	private Double gridUnitRate;

	private Map<String, Object> config;
	
	private Double stanzaCharges;
	
	private Double residentCharges;
	
	private Double prepaidCharges;
	
	private Double postpaidCharges;
	
	private Date addedAt;

	private String addedBy;

	private ElectricityBillStatus electricityBillStatus;

	private ApprovalStatus approvalStatus;
	
	private String approvalStatusName;
	
	private List<String> pendingApprovers;

}