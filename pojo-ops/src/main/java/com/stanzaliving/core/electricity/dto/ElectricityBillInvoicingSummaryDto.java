package com.stanzaliving.core.electricity.dto;

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
public class ElectricityBillInvoicingSummaryDto {
	
	private double invoicePendingAmount;
	private int invoicePendingCount;
	private double invoiceDoneAmount;
	private int invoiceDoneCount;
	private double overAllInvoiceAmount;
	private int overAllInvoiceCount;

	private double pendingStanzaCharges;
	private double pendingResidentCharges;
	private double pendingPrepaidCharges;
	private double pendingPostpaidCharges;
	
	private double approvedStanzaCharges;
	private double approvedResidentCharges;
	private double approvedPrepaidCharges;
	private double approvedPostpaidCharges;

}