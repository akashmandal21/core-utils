package com.stanzaliving.core.inventory_transformations.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Table(name = "RESIDENCE_TYPE")
@Data
public class ResidenceType implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(insertable = false, name = "RESIDENCE_TYPE_ID", nullable = false)
    private Integer residenceTypeId;

    @Column(name = "RESIDENCE_ID", nullable = false)
    private Integer residenceId;

    @Column(name = "ADMIN_CHARGES")
    private Integer adminCharges;

    @Column(name = "NON_REFUNDABLE_SECURITY_DEPOSIT")
    private Integer nonRefundableSecurityDeposit;

    @Column(name = "REFUNDABLE_SECURITY_DEPOSIT")
    private Integer refundableSecurityDeposit;

    @Column(name = "ADVANCE_RENTAL")
    private Integer advanceRental;

    @Column(name = "RETENTION_BOOKING_AMOUNT")
    private Double retentionBookingAmount;

    @Column(name = "TYPE", nullable = false)
    private Integer TYPE;

    @Column(name = "CREATED", nullable = false)
    private LocalDateTime CREATED;

    @Column(name = "UPDATED", nullable = false)
    private LocalDateTime UPDATED;

    @Column(name = "PENALTY_AMOUNT")
    private Double penaltyAmount = 0D;

    @Column(name = "MAINTENANCE_FEE")
    private Double maintenanceFee = 0D;

    @Column(name = "VARIABLE_SECURITY_DEPOSIT")
    private Double variableSecurityDeposit;

    
}