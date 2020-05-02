package com.stanzaliving.core.inventory_transformations.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "COMMERCIALS_CARD")
@Data
public class CommercialsCard implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", insertable = false, nullable = false)
    private Integer ID;

    @Column(name = "START_DATE")
    private LocalDate startDate;

    @Column(name = "END_DATE")
    private LocalDate endDate;

    @Column(name = "RESIDENCE_ID")
    private Integer residenceId = 0;

    @Column(name = "CITY_ID")
    private Integer cityId = 0;

    @Column(name = "MICROMARKET_ID")
    private Integer micromarketId = 0;

    @Column(name = "NAME")
    private String NAME = "0";

    @Column(name = "PROPERTY_CATEGORY")
    private Integer propertyCategory = 0;

    @Column(name = "USAGE_COUNT")
    private Integer usageCount = 0;

    @Column(name = "AVAILABLE_COUNT")
    private Integer availableCount = 1;

    @Column(name = "IS_AUTO_APPLICABLE", nullable = false)
    private Integer autoApplicable = 0;

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

    @Column(name = "APPROVED", nullable = false)
    private Integer APPROVED = 0;

    @Column(name = "APPROVED_BY")
    private String approvedBy;

    @Column(name = "APPROVED_ON")
    private LocalDate approvedOn;

    @Column(name = "UPDATED")
    private LocalDateTime UPDATED;

    @Column(name = "CREATED", nullable = false)
    private LocalDateTime CREATED;

    
}