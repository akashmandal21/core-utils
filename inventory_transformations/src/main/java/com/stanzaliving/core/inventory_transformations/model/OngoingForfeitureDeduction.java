package com.stanzaliving.core.inventory_transformations.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "ONGOING_FORFEITURE_DEDUCTION")
public class OngoingForfeitureDeduction {

	@Id
	@Column(name = "BOOKING_ID")
	public Integer bookingId;

	@Column(name = "INVENTORY_ID", nullable = true)
	public Integer inventoryId;
	
	@Builder.Default
	@Column(name = "ONBOARDED")
	public Integer onboarded = 0;
	
	@Column(name = "TOTAL_AMOUNT")
	public double totalAmount;

	@Column(name = "ADVENCE_RENTAL_AMOUNT")
	public double advanceRentalAmount;

	@Column(name = "SECURITY_DEPOSIT_AMOUNT")
	public double securityDepositAmount;
	
	@Column(name = "REMAINING_AMOUNT")
	public double remainingAmount;
	
	@Column(name = "ONE_DAY_RENT")
	public double oneDayRent;
	
	@Column(name = "DEDUCTIONS_MADE")
	public Integer deductionsMade;
	
	@Column(name = "CONTRACT_END_DATE")
	public Date contractEndDate;

	@Column(name = "CANCELLED_DATE")
	public Date cancelledDate;

	@Column(name = "BOOKING_TYPE")
	public Integer bookingType;
		
}
