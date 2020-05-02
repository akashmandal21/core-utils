package com.stanzaliving.core.inventory_transformations.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Table(name = "COMMERCIAL_CARD_BOOKING_AUDIT")
@Data
public class CommercialCardBookingAudit implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", insertable = false, nullable = false)
    private Integer ID;

    @Column(name = "BOOKING_ID")
    private Integer bookingId;

    @Column(name = "COMMERCIAL_CARD_ID")
    private Integer commercialCardId;

    @Column(name = "REFUNDABLE_SECURITY")
    private Double refundableSecurity = 0D;

    @Column(name = "MONTHLY_MAINTENANCE_FEE")
    private Double monthlyMaintenanceFee = 0D;

    @Column(name = "ANNUAL_MAINTENANCE_FEE")
    private Double annualMaintenanceFee = 0D;

    @Column(name = "ADVANCE_RENTAL_MONTHS")
    private Integer advanceRentalMonths = 1;

    @Column(name = "VARIABLE_SECURITY_DEPOSIT")
    private Double variableSecurityDeposit = 0D;

    @Column(name = "CREATED_BY")
    private String createdBy;

    @Column(name = "UPDATED")
    private LocalDateTime UPDATED;

    @Column(name = "CREATED", nullable = false)
    private LocalDateTime CREATED;

    
}