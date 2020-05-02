package com.stanzaliving.core.inventory_transformations.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@Table(name = "REVENUE_DEDUCTION")
@Entity
public class RevenueDeduction implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @Column(insertable = false, name = "BOOKING_ID", nullable = false)
    private Integer bookingId;

    @Column(name = "ONBOARDED", nullable = false)
    private Integer ONBOARDED = 0;

    @Column(name = "CONTRACT_START_DATE")
    private LocalDate contractStartDate;

    @Column(name = "TOTAL_AMOUNT", nullable = false)
    private Double totalAmount = 0D;

    @Column(name = "REMAINING_AMOUNT", nullable = false)
    private Double remainingAmount = 0D;

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

    
}