package com.stanzaliving.core.electricity.dto;

import java.util.Date;

import com.stanzaliving.approval.enums.ApprovalStatus;
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
	
	private Date billDurationFrom;
	
	private Date billDurationTo;
	
	private ElectricityBillType electricityBillType;
	
	private String electricityBillTypeName;

	private double billAmount;

	private double residentShareAmount;
	
	private double stanzaShareAmount;
	
	private double residentSharePercent;
	
	private double stanzaSharePercent;
	
	private ApprovalStatus approvalStatus;
	
	private String approvalStatusName;
	
	private Date addedAt;

	private String addedBy;
	
}