package com.stanzaliving.core.inventory_transformations.entity;

import com.fasterxml.jackson.annotation.JsonProperty;


import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Table(name = "BOOKING_COMMERCIALS")
@Entity
@Data
public class BookingCommercialsEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @Column(insertable = false, name = "BOOKING_ID", nullable = false)
	@JsonProperty("booking_id")
    private Integer bookingId;

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

    @Column(name = "VAS_PRICE")
	@JsonProperty("vas_price")
    private Double vasPrice = 0D;

    @Column(name = "INITIAL_ADVANCE_RENTAL_MONTHS")
	@JsonProperty("initial_advance_rental_months")
    private Integer initialAdvanceRentalMonths;

    @Column(name = "SALES_BUFFER_PRICE")
	@JsonProperty("sales_buffer_price")
    private Double salesBufferPrice = 0D;

    @Column(name = "AGGREGATED_BOOKING_AMOUNT")
	@JsonProperty("aggregated_booking_amount")
    private Double aggregatedBookingAmount = 0D;

    @Column(name = "SECURITY_DEPOSIT")
	@JsonProperty("security_deposit")
    private Double securityDeposit = 0D;

    @Column(name = "MAINTENANCE_FEE")
	@JsonProperty("maintenance_fee")
    private Double maintenanceFee = 0D;

    @Column(name = "MAINTENANCE_FEE_SELECTION_ID")
	@JsonProperty("maintenance_fee_selection_id")
    private Integer maintenanceFeeSelectionId = 0;

    @Column(name = "COMMERCIALS_CARD_ID")
	@JsonProperty("commercials_card_id")
    private Integer commercialsCardId = -1;

    
}