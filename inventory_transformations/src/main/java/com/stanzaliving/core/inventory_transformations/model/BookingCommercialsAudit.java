package com.stanzaliving.core.inventory_transformations.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.NamedQueries;
import org.hibernate.annotations.NamedQuery;

import javax.persistence.*;
import java.util.Date;

@NamedQueries({
	  @NamedQuery(name="findAllCommAuditIdByBooking",
	              query="SELECT commAudit FROM BookingCommercialsAudit commAudit join commAudit.bookingAudit bookingAudit WHERE bookingAudit.student = :studentId"
	              		+ " and bookingAudit.bookingStatus = \'ONBOARDING COMPLETED\' " )
	})


@Getter
@Setter
@Entity
@Table(name = "BOOKING_COMMERCIALS_AUDIT")
public class BookingCommercialsAudit {

	@Id
	private int Id;

	@JsonIgnore
	@JoinColumn(name = "BOOKING_AUDIT_ID")
	@OneToOne(fetch = FetchType.LAZY)
	@MapsId
	private BookingAudit bookingAudit;

	@Column(name = "DISCOUNT_ID")
	private String discount;

	@Column(name = "ROOM_PRICE")
	private double roomPrice;

	@Column(name = "MANDATORY_SERVICE_PRICE")
	private double mandatoryServicePrice;

	@Column(name = "OPTIONAL_SERVICE_PRICE")
	private double optionalServicePrice;

	@Column(name = "BUFFER_PRICE")
	private double bufferPrice;

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

	@Column(name = "BOOKING_AMOUNT")
	private double bookingAmount;

	@Column(name = "ADVANCE_RENTAL")
	private double advanceRental;

	@Column(name = "ADVANCE_RENTAL_MONTHS")
	private int advanceRentalMonths;

	@Column(name = "ADVANCE_AMOUNT")
	private double advanceAmount;

	@Column(name = "TOTAL_AMOUNT")
	private double totalAmount;
	
	@Column(name = "VALID_FROM")
	private Date validFrom;
	
	@Column(name = "VALID_TO")
	private Date validTo;
	
	@Column(name = "INITIAL_ADVANCE_RENTAL_MONTHS")
	private Integer initialAdvanceRentalMonths;

	@Column(name = "VAS_PRICE")
	private double vasPrice;

	@Column(name = "SALES_BUFFER_PRICE")
	private Integer salesBufferPrice;
	
	@Column(name = "SECURITY_DEPOSIT")
	private double securityDeposit;
	
	@Column(name = "MAINTENANCE_FEE")
	private double maintenanceFee;
}
