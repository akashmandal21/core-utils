package com.stanzaliving.core.electricity.dto;

import java.util.Date;

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
public class ElectricityBillListingDto {
	
	private String propertyName;
	
	private String propertyCode;
	
	private String residenceId;
	
	private ApartmentType apartmentType;
	
	private String apartmentTypeName;
	
	private String propertyAddressLine1;
	
	private String propertyAddressLine2;
	
	private String cityName;
	
	private String cityId;
	
	private String micromarketName;
	
	private String micromarketId;
	
	private String societyName;
	
	private double invoicePendingAmount;
	
	private int invoicePendingCount;
	
	private double invoiceDoneAmount;
	
	private int invoiceDoneCount;
	
	private double overAllInvoiceAmount;
	
	private int overAllInvoiceCount;
	
	private Date lastUpdatedAt;

	private String lastUpdatedBy;
	
	private double pendingStanzaCharges;
	private double pendingResidentCharges;
	private double pendingPrepaidCharges;
	private double pendingPostpaidCharges;
	
	private double approvedStanzaCharges;
	private double approvedResidentCharges;
	private double approvedPrepaidCharges;
	private double approvedPostpaidCharges;
	
}