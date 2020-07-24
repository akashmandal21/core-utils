package com.stanzaliving.core.inventory_transformations.entity;

import com.fasterxml.jackson.annotation.JsonProperty;


import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;
import java.sql.Timestamp;

@Data
@Table(name = "COMMERCIALS_CARD")
@Entity
public class CommercialsCardEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", insertable = false, nullable = false)
	@JsonProperty("ID")
    private Integer ID;

    @Column(name = "START_DATE")
	@JsonProperty("START_DATE")
    private Date startDate;

    @Column(name = "END_DATE")
	@JsonProperty("END_DATE")
    private Date endDate;

    @Column(name = "RESIDENCE_ID")
	@JsonProperty("RESIDENCE_ID")
    private Integer residenceId = 0;

    @Column(name = "CITY_ID")
	@JsonProperty("CITY_ID")
    private Integer cityId = 0;

    @Column(name = "MICROMARKET_ID")
	@JsonProperty("MICROMARKET_ID")
    private Integer micromarketId = 0;

    @Column(name = "NAME")
	@JsonProperty("NAME")
    private String NAME = "0";

    @Column(name = "PROPERTY_CATEGORY")
	@JsonProperty("PROPERTY_CATEGORY")
    private Integer propertyCategory = 0;

    @Column(name = "USAGE_COUNT")
	@JsonProperty("USAGE_COUNT")
    private Integer usageCount = 0;

    @Column(name = "AVAILABLE_COUNT")
	@JsonProperty("AVAILABLE_COUNT")
    private Integer availableCount = 1;

    @Column(name = "IS_AUTO_APPLICABLE", nullable = false, columnDefinition = "tinyint")
	@JsonProperty("IS_AUTO_APPLICABLE")
    private Integer autoApplicable = 0;

    @Column(name = "REFUNDABLE_SECURITY")
	@JsonProperty("REFUNDABLE_SECURITY")
    private Double refundableSecurity;

    @Column(name = "MONTHLY_MAINTENANCE_FEE")
	@JsonProperty("MONTHLY_MAINTENANCE_FEE")
    private Double monthlyMaintenanceFee;

    @Column(name = "ANNUAL_MAINTENANCE_FEE")
	@JsonProperty("ANNUAL_MAINTENANCE_FEE")
    private Double annualMaintenanceFee;

    @Column(name = "ADVANCE_RENTAL_MONTHS")
	@JsonProperty("ADVANCE_RENTAL_MONTHS")
    private Integer advanceRentalMonths;

    @Column(name = "VARIABLE_SECURITY_DEPOSIT")
	@JsonProperty("VARIABLE_SECURITY_DEPOSIT")
    private Double variableSecurityDeposit;

    @Column(name = "CREATED_BY")
	@JsonProperty("CREATED_BY")
    private String createdBy;

    @Column(name = "APPROVED", nullable = false, columnDefinition = "tinyint")
	@JsonProperty("APPROVED")
    private Integer APPROVED = 0;

    @Column(name = "APPROVED_BY")
	@JsonProperty("APPROVED_BY")
    private String approvedBy;

    @Column(name = "APPROVED_ON")
	@JsonProperty("APPROVED_ON")
    private Date approvedOn;

    @Column(name = "UPDATED")
	@JsonProperty("UPDATED")
    private Timestamp UPDATED;

    @Column(name = "CREATED", nullable = false)
	@JsonProperty("CREATED")
    private Timestamp CREATED;

    @Column(name = "NON_REFUNDABLE_SECURITY")
	@JsonProperty("NON_REFUNDABLE_SECURITY")
    private Double nonRefundableSecurity;

    @Column(name = "ADMIN_CHARGES")
	@JsonProperty("ADMIN_CHARGES")
    private Double adminCharges;

    
}