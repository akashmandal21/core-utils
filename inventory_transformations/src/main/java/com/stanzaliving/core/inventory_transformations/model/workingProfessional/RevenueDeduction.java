package com.stanzaliving.core.inventory_transformations.model.workingProfessional;

//import com.stanzaliving.inventory.converter.JsonToMapConverter;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;
import java.util.Map;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "REVENUE_DEDUCTION")
public class RevenueDeduction {

	@Id
	@Column(name = "BOOKING_ID")
	public Integer bookingId;
	
	@Builder.Default
	@Column(name = "ONBOARDED")
	public Integer onboarded = 0;
	
	@Column(name = "TOTAL_AMOUNT")
	public double totalAmount;
	
	@Column(name = "REMAINING_AMOUNT")
	public double remainingAmount;
	
	@Column(name = "ONE_DAY_RENT")
	public double oneDayRent;
	
	@Column(name = "DEDUCTIONS_MADE")
	public Integer deductionsMade;
	
	@Column(name = "CONTRACT_START_DATE")
	public Date contractStartDate;
	
	//@Convert(converter = JsonToMapConverter.class)
    private Map<String, String> metadata;
		
}
