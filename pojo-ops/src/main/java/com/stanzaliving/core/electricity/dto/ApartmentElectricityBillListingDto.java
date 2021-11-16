package com.stanzaliving.core.electricity.dto;

import java.util.Date;
import java.util.List;

import com.stanzaliving.approval.enums.ApprovalStatus;
import com.stanzaliving.core.electricity.constants.ElectricityBillStatus;
import com.stanzaliving.core.electricity.constants.ElectricityBillType;

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
public class ApartmentElectricityBillListingDto {
	
	private String billNumber;
	
	private String uuid;
	
	private String residenceId;
	
	private Date billDurationFrom;
	
	private Date billDurationTo;
	
	private ElectricityBillType electricityBillType;
	
	private String electricityBillTypeName;

	private double billAmount;

	private double residentShareAmount;
	
	private double stanzaShareAmount;
	
	private double residentSharePercent;
	
	private double stanzaSharePercent;
	
	private double postpaidCharges; 
	
	private double prepaidCharges; 

	private ElectricityBillStatus electricityBillStatus;
	
	private String electricityBillStatusName;
	
	private ApprovalStatus approvalStatus;
	
	private String approvalStatusName;
	
	private List<String> pendingApprovers;
	
	private Date addedAt;

	private String addedBy;
	
	private String bgColorCode;
	
	private String textColorCode;
	
}