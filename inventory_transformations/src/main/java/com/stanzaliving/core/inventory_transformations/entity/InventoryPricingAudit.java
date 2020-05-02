package com.stanzaliving.core.inventory_transformations.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Table(name = "INVENTORY_PRICING_AUDIT")
@Entity
@Data
public class InventoryPricingAudit implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", insertable = false, nullable = false)
    private Integer ID;

    @Column(name = "START_DATE")
    private LocalDate startDate;

    @Column(name = "END_DATE")
    private LocalDate endDate;

    @Column(name = "ROOM_ID")
    private Integer roomId;

    @Column(name = "RESIDENCE_ID")
    private Integer residenceId;

    @Column(name = "INVENTORY_ID")
    private Integer inventoryId = 0;

    @Column(name = "ATTRIBUTES_PRICE")
    private Integer attributesPrice;

    @Column(name = "BASE_PRICE")
    private Integer basePrice;

    @Column(name = "BUFFER_PRICE")
    private Integer bufferPrice;

    @Column(name = "MANDATORY_SERVICES_PRICE")
    private Integer mandatoryServicesPrice;

    @Column(name = "ROOM_PRICE")
    private Integer roomPrice;

    @Column(name = "CGST")
    private Double CGST;

    @Column(name = "IGST")
    private Double IGST;

    @Column(name = "SGST")
    private Double SGST;

    @Column(name = "STUDENT_ADMIN_CHARGES")
    private Integer studentAdminCharges;

    @Column(name = "STUDENT_NON_REFUNDABLE_SECURITY_DEPOSIT")
    private Integer studentNonRefundableSecurityDeposit;

    @Column(name = "STUDENT_REFUNDABLE_SECURITY_DEPOSIT")
    private Integer studentRefundableSecurityDeposit;

    @Column(name = "STUDENT_ADVANCE_RENTAL")
    private Integer studentAdvanceRental;

    @Column(name = "STUDENT_RETENTION_BOOKING_AMOUNT")
    private Double studentRetentionBookingAmount;

    @Column(name = "STUDENT_MAINTENANCE_FEE")
    private Double studentMaintenanceFee;

    @Column(name = "STUDENT_PENALTY_AMOUNT")
    private Double studentPenaltyAmount = 0D;

    @Column(name = "WP_ADMIN_CHARGES")
    private Integer wpAdminCharges;

    @Column(name = "WP_NON_REFUNDABLE_SECURITY_DEPOSIT")
    private Integer wpNonRefundableSecurityDeposit;

    @Column(name = "WP_REFUNDABLE_SECURITY_DEPOSIT")
    private Integer wpRefundableSecurityDeposit;

    @Column(name = "WP_ADVANCE_RENTAL")
    private Integer wpAdvanceRental;

    @Column(name = "WP_RETENTION_BOOKING_AMOUNT")
    private Double wpRetentionBookingAmount;

    @Column(name = "WP_PENALTY_AMOUNT")
    private Double wpPenaltyAmount = 0D;

    @Column(name = "WP_MAINTENANCE_FEE")
    private Double wpMaintenanceFee;

    @Column(name = "ENABLED")
    private Boolean ENABLED = Boolean.FALSE;

    @Column(name = "VARIABLE_SECURITY_DEPOSIT")
    private Double variableSecurityDeposit;

    @Column(name = "INVENTORY_PRICING_ID")
    private Integer inventoryPricingId;

    @Column(name = "UPDATED")
    private LocalDateTime UPDATED;

    @Column(name = "CREATED", nullable = false)
    private LocalDateTime CREATED;

    
}