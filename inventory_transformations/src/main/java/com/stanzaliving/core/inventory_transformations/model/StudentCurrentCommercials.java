package com.stanzaliving.core.inventory_transformations.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Builder
@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "STUDENT_CURRENT_COMMERCIALS")
public class StudentCurrentCommercials {

	@Id
	@GeneratedValue
	@Column(name = "ID")
	private int id;
	
	@Column(name  = "BOOKING_ID")
	private int bookingId;
	
	@Column(name = "DISCOUNT_ID")
	private String discountId;
	
	@Column(name = "ROOM_PRICE")
	private double roomPrice;

	@Column(name = "MANDATORY_SERVICE_PRICE")
	private double mandatoryServicePrice;

	@Column(name = "OPTIONAL_SERVICE_PRICE")
	private double optionalServicePrice;
	
	@Column(name = "VAS_PRICE")
	private double vasPrice;

	@Column(name = "CGST")
	private double cgst;

	@Column(name = "SGST")
	private double sgst;

	@Column(name = "IGST")
	private double igst;

	@Column(name = "REFUNDABLE_SECURITY")
	private double refundableSecurity;

	@Column(name = "NON_REFUNDABLE_SECURITY")
	private double nonRefundableSecurity;

	@Column(name = "ADMIN_CHARGES")
	private double adminCharges;

	@Column(name = "ADVANCE_RENTAL_MONTHS")
	private int advanceRentalMonths;

	@Column(name = "TOTAL_AMOUNT")
	private double totalAmount;
	
	@Column(name = "VERSION")
	private int version;
	
	@Column(name = "TYPE")
	private String type;
}
