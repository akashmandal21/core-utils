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
	@JsonProperty("BOOKING_ID")
    private Integer bookingId;

    @Column(name = "ADMIN_CHARGES")
	@JsonProperty("ADMIN_CHARGES")
    private Double adminCharges;

    @Column(name = "ADVANCE_AMOUNT")
	@JsonProperty("ADVANCE_AMOUNT")
    private Double advanceAmount;

    @Column(name = "MANDATORY_SERVICE_PRICE")
	@JsonProperty("MANDATORY_SERVICE_PRICE")
    private Double mandatoryServicePrice;

    @Column(name = "NON_REFUNDABLE_SECURITY")
	@JsonProperty("NON_REFUNDABLE_SECURITY")
    private Double nonRefundableSecurity;

    @Column(name = "OPTIONAL_SERVICE_PRICE")
	@JsonProperty("OPTIONAL_SERVICE_PRICE")
    private Double optionalServicePrice;

    @Column(name = "REFUNDABLE_SECURITY")
	@JsonProperty("REFUNDABLE_SECURITY")
    private Double refundableSecurity;

    @Column(name = "ROOM_PRICE")
	@JsonProperty("ROOM_PRICE")
    private Double roomPrice;

    @Column(name = "TOTAL_AMOUNT")
	@JsonProperty("TOTAL_AMOUNT")
    private Double totalAmount;

    @Column(name = "DISCOUNT_ID")
	@JsonProperty("DISCOUNT_ID")
    private String discountId;

    @Column(name = "BOOKING_AMOUNT")
	@JsonProperty("BOOKING_AMOUNT")
    private Double bookingAmount;

    @Column(name = "ADVANCE_RENTAL")
	@JsonProperty("ADVANCE_RENTAL")
    private Double advanceRental;

    @Column(name = "CGST")
	@JsonProperty("CGST")
    private Double CGST;

    @Column(name = "IGST")
	@JsonProperty("IGST")
    private Double IGST;

    @Column(name = "SGST")
	@JsonProperty("SGST")
    private Double SGST;

    @Column(name = "ADVANCE_RENTAL_MONTHS")
	@JsonProperty("ADVANCE_RENTAL_MONTHS")
    private Integer advanceRentalMonths;

    @Column(name = "BUFFER_PRICE")
	@JsonProperty("BUFFER_PRICE")
    private Double bufferPrice;

    @Column(name = "VAS_PRICE")
	@JsonProperty("VAS_PRICE")
    private Double vasPrice = 0D;

    @Column(name = "INITIAL_ADVANCE_RENTAL_MONTHS")
	@JsonProperty("INITIAL_ADVANCE_RENTAL_MONTHS")
    private Integer initialAdvanceRentalMonths;

    @Column(name = "SALES_BUFFER_PRICE")
	@JsonProperty("SALES_BUFFER_PRICE")
    private Double salesBufferPrice = 0D;

    @Column(name = "AGGREGATED_BOOKING_AMOUNT")
	@JsonProperty("AGGREGATED_BOOKING_AMOUNT")
    private Double aggregatedBookingAmount = 0D;

    @Column(name = "SECURITY_DEPOSIT")
	@JsonProperty("SECURITY_DEPOSIT")
    private Double securityDeposit = 0D;

    @Column(name = "MAINTENANCE_FEE")
	@JsonProperty("MAINTENANCE_FEE")
    private Double maintenanceFee = 0D;

    @Column(name = "MAINTENANCE_FEE_SELECTION_ID")
	@JsonProperty("MAINTENANCE_FEE_SELECTION_ID")
    private Integer maintenanceFeeSelectionId = 0;

    @Column(name = "COMMERCIALS_CARD_ID")
	@JsonProperty("COMMERCIALS_CARD_ID")
    private Integer commercialsCardId = -1;

    
}