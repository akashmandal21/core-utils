package com.stanzaliving.core.inventory_transformations.entity;

import com.fasterxml.jackson.annotation.JsonProperty;


import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.sql.Timestamp;

@Entity
@Table(name = "BOOKING_COMMERCIALS_AUDIT")
@Data
public class BookingCommercialsAuditEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @Column(insertable = false, name = "BOOKING_AUDIT_ID", nullable = false)
	@JsonProperty("booking_audit_id")
    private Integer bookingAuditId;

    @Column(name = "ADMIN_CHARGES")
	@JsonProperty("admin_charges")
    private Double adminCharges;

    @Column(name = "ADVANCE_AMOUNT")
	@JsonProperty("advance_amount")
    private Double advanceAmount;

    @Column(name = "MANDATORY_SERVICE_PRICE")
	@JsonProperty("mandatory_service_price")
    private Double mandatoryServicePrice;

    @Column(name = "NON_REFUNDABLE_SECURITY")
	@JsonProperty("non_refundable_security")
    private Double nonRefundableSecurity;

    @Column(name = "OPTIONAL_SERVICE_PRICE")
	@JsonProperty("optional_service_price")
    private Double optionalServicePrice;

    @Column(name = "REFUNDABLE_SECURITY")
	@JsonProperty("refundable_security")
    private Double refundableSecurity;

    @Column(name = "ROOM_PRICE")
	@JsonProperty("room_price")
    private Double roomPrice;

    @Column(name = "TOTAL_AMOUNT")
	@JsonProperty("total_amount")
    private Double totalAmount;

    @Column(name = "DISCOUNT_ID")
	@JsonProperty("discount_id")
    private String discountId;

    @Column(name = "BOOKING_AMOUNT")
	@JsonProperty("booking_amount")
    private Double bookingAmount;

    @Column(name = "ADVANCE_RENTAL")
	@JsonProperty("advance_rental")
    private Double advanceRental;

    @Column(name = "CGST")
	@JsonProperty("cgst")
    private Double CGST;

    @Column(name = "IGST")
	@JsonProperty("igst")
    private Double IGST;

    @Column(name = "SGST")
	@JsonProperty("sgst")
    private Double SGST;

    @Column(name = "ADVANCE_RENTAL_MONTHS")
	@JsonProperty("advance_rental_months")
    private Integer advanceRentalMonths;

    @Column(name = "BUFFER_PRICE")
	@JsonProperty("buffer_price")
    private Double bufferPrice;

    @Column(name = "VALID_FROM")
	@JsonProperty("valid_from")
    private Timestamp validFrom;

    @Column(name = "VALID_TO")
	@JsonProperty("valid_to")
    private Timestamp validTo;

    @Column(name = "INITIAL_ADVANCE_RENTAL_MONTHS")
	@JsonProperty("initial_advance_rental_months")
    private Integer initialAdvanceRentalMonths;

    @Column(name = "VAS_PRICE")
	@JsonProperty("vas_price")
    private Double vasPrice = 0D;

    @Column(name = "SALES_BUFFER_PRICE")
	@JsonProperty("sales_buffer_price")
    private Double salesBufferPrice = 0D;

    @Column(name = "SECURITY_DEPOSIT")
	@JsonProperty("security_deposit")
    private Double securityDeposit = 0D;

    @Column(name = "MAINTENANCE_FEE")
	@JsonProperty("maintenance_fee")
    private Double maintenanceFee = 0D;

    
}