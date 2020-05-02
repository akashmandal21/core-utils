package com.stanzaliving.core.inventory_transformations.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.time.LocalDateTime;

@Table(name = "ONGOING_FORFEITURE_DEDUCTION")
@Data
@Entity
public class OngoingForfeitureDeduction implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @Column(insertable = false, name = "BOOKING_ID", nullable = false)
    private Integer bookingId;

    @Column(name = "INVENTORY_ID")
    private Integer inventoryId;

    @Column(name = "ONBOARDED", nullable = false)
    private Integer ONBOARDED = 0;

    @Column(name = "CONTRACT_END_DATE")
    private LocalDateTime contractEndDate;

    @Column(name = "CANCELLED_DATE")
    private LocalDateTime cancelledDate;

    @Column(name = "TOTAL_AMOUNT", nullable = false)
    private Double totalAmount = 0D;

    @Column(name = "REMAINING_AMOUNT", nullable = false)
    private Double remainingAmount = 0D;

    @Column(name = "SECURITY_DEPOSIT_AMOUNT", nullable = false)
    private Double securityDepositAmount = 0D;

    @Column(name = "ADVENCE_RENTAL_AMOUNT", nullable = false)
    private Double advenceRentalAmount = 0D;

    @Column(name = "ONE_DAY_RENT", nullable = false)
    private Double oneDayRent = 0D;

    @Column(name = "DEDUCTIONS_MADE", nullable = false)
    private Integer deductionsMade = 0;

    @Column(name = "CREATED_AT", nullable = false)
    private LocalDateTime createdAt;

    @Column(name = "UPDATED_AT", nullable = false)
    private LocalDateTime updatedAt;

    @Column(name = "METADATA")
    private String METADATA;

    @Column(name = "BOOKING_TYPE", nullable = false)
    private Integer bookingType = 0;

    
}