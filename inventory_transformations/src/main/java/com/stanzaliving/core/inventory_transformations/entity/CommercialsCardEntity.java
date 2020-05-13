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
	@JsonProperty("id")
    private Integer ID;

    @Column(name = "START_DATE")
	@JsonProperty("start_date")
    private Date startDate;

    @Column(name = "END_DATE")
	@JsonProperty("end_date")
    private Date endDate;

    @Column(name = "RESIDENCE_ID")
	@JsonProperty("residence_id")
    private Integer residenceId = 0;

    @Column(name = "CITY_ID")
	@JsonProperty("city_id")
    private Integer cityId = 0;

    @Column(name = "MICROMARKET_ID")
	@JsonProperty("micromarket_id")
    private Integer micromarketId = 0;

    @Column(name = "NAME")
	@JsonProperty("name")
    private String NAME = "0";

    @Column(name = "PROPERTY_CATEGORY")
	@JsonProperty("property_category")
    private Integer propertyCategory = 0;

    @Column(name = "USAGE_COUNT")
	@JsonProperty("usage_count")
    private Integer usageCount = 0;

    @Column(name = "AVAILABLE_COUNT")
	@JsonProperty("available_count")
    private Integer availableCount = 1;

    @Column(name = "IS_AUTO_APPLICABLE", nullable = false, columnDefinition = "tinyint")
	@JsonProperty("is_auto_applicable")
    private Integer autoApplicable = 0;

    @Column(name = "REFUNDABLE_SECURITY")
	@JsonProperty("refundable_security")
    private Double refundableSecurity;

    @Column(name = "MONTHLY_MAINTENANCE_FEE")
	@JsonProperty("monthly_maintenance_fee")
    private Double monthlyMaintenanceFee;

    @Column(name = "ANNUAL_MAINTENANCE_FEE")
	@JsonProperty("annual_maintenance_fee")
    private Double annualMaintenanceFee;

    @Column(name = "ADVANCE_RENTAL_MONTHS")
	@JsonProperty("advance_rental_months")
    private Integer advanceRentalMonths;

    @Column(name = "VARIABLE_SECURITY_DEPOSIT")
	@JsonProperty("variable_security_deposit")
    private Double variableSecurityDeposit;

    @Column(name = "CREATED_BY")
	@JsonProperty("created_by")
    private String createdBy;

    @Column(name = "APPROVED", nullable = false, columnDefinition = "tinyint")
	@JsonProperty("approved")
    private Integer APPROVED = 0;

    @Column(name = "APPROVED_BY")
	@JsonProperty("approved_by")
    private String approvedBy;

    @Column(name = "APPROVED_ON")
	@JsonProperty("approved_on")
    private Date approvedOn;

    @Column(name = "UPDATED")
	@JsonProperty("updated")
    private Timestamp UPDATED;

    @Column(name = "CREATED", nullable = false)
	@JsonProperty("created")
    private Timestamp CREATED;

    @Column(name = "NON_REFUNDABLE_SECURITY")
	@JsonProperty("non_refundable_security")
    private Double nonRefundableSecurity;

    @Column(name = "ADMIN_CHARGES")
	@JsonProperty("admin_charges")
    private Double adminCharges;

    
}