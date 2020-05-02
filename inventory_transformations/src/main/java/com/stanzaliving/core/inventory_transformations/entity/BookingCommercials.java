package com.stanzaliving.core.inventory_transformations.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Table(name = "BOOKING_COMMERCIALS")
@Data
@Entity
public class BookingCommercials implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @Column(insertable = false, name = "BOOKING_ID", nullable = false)
    private Integer bookingId;

    @Column(name = "ADMIN_CHARGES")
    private Double adminCharges;

    @Column(name = "ADVANCE_AMOUNT")
    private Double advanceAmount;

    @Column(name = "MANDATORY_SERVICE_PRICE")
    private Double mandatoryServicePrice;

    @Column(name = "NON_REFUNDABLE_SECURITY")
    private Double nonRefundableSecurity;

    @Column(name = "OPTIONAL_SERVICE_PRICE")
    private Double optionalServicePrice;

    @Column(name = "REFUNDABLE_SECURITY")
    private Double refundableSecurity;

    @Column(name = "ROOM_PRICE")
    private Double roomPrice;

    @Column(name = "TOTAL_AMOUNT")
    private Double totalAmount;

    @Column(name = "DISCOUNT_ID")
    private String discountId;

    @Column(name = "BOOKING_AMOUNT")
    private Double bookingAmount;

    @Column(name = "ADVANCE_RENTAL")
    private Double advanceRental;

    @Column(name = "CGST")
    private Double CGST;

    @Column(name = "IGST")
    private Double IGST;

    @Column(name = "SGST")
    private Double SGST;

    @Column(name = "ADVANCE_RENTAL_MONTHS")
    private Integer advanceRentalMonths;

    @Column(name = "BUFFER_PRICE")
    private Double bufferPrice;

    @Column(name = "VAS_PRICE")
    private Double vasPrice = 0D;

    @Column(name = "INITIAL_ADVANCE_RENTAL_MONTHS")
    private Integer initialAdvanceRentalMonths;

    @Column(name = "SALES_BUFFER_PRICE")
    private Double salesBufferPrice = 0D;

    @Column(name = "AGGREGATED_BOOKING_AMOUNT")
    private Double aggregatedBookingAmount = 0D;

    @Column(name = "SECURITY_DEPOSIT")
    private Double securityDeposit = 0D;

    @Column(name = "MAINTENANCE_FEE")
    private Double maintenanceFee = 0D;

    @Column(name = "MAINTENANCE_FEE_SELECTION_ID")
    private Integer maintenanceFeeSelectionId = 0;

    @Column(name = "COMMERCIALS_CARD_ID")
    private Integer commercialsCardId = -1;

    
}