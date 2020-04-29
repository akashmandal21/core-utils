package com.stanzaliving.core.inventory_transformations.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "COMMERCIALS_CARD")
public class CommercialsCard {
    @Id
    @GeneratedValue
    @Column(name = "ID")
    private int id;

    @Column(name = "NAME")
    private String name;

    @Column(name = "PROPERTY_CATEGORY")
    private PropertyCategory propertyCategory;

    @Column(name = "USAGE_COUNT")
    private Integer usageCount;

    @Column(name = "AVAILABLE_COUNT")
    private Integer availableCount;

    @Column(name = "IS_AUTO_APPLICABLE")
    private Boolean autoApplicable = Boolean.FALSE;

    @Column(name = "START_DATE")
    private Date startDate;

    @Column(name = "END_DATE")
    private Date endDate;

    @Column(name = "RESIDENCE_ID")
    private Integer residenceId;

    @Column(name = "CITY_ID")
    private Integer cityId;

    @Column(name = "MICROMARKET_ID")
    private Integer micromarketId;

    @Column(name = "REFUNDABLE_SECURITY")
    private Double refundableSecurity;

    @Column(name = "MONTHLY_MAINTENANCE_FEE")
    private Double monthlyMaintenanceFee;

    @Column(name = "ANNUAL_MAINTENANCE_FEE")
    private Double annualMaintenanceFee;

    @Column(name = "ADVANCE_RENTAL_MONTHS")
    private Integer advanceRentalMonths;
    
    @Column(name = "APPROVED")
    private Boolean approved = Boolean.FALSE;
    
    @Column(name = "APPROVED_BY")
    private String approvedBy;
    
    @Column(name = "APPROVED_ON")
    private Date approvedOn;
    
    @Column(name = "CREATED_BY")
    private String createdBy;
    
    @Column(name = "VARIABLE_SECURITY_DEPOSIT")
    private Double variableSecurityDeposit;
    
    @Transient
    private String status;
    
    @Transient
    private Date createdOn;
    
    @Transient
    private Double annualSecurityDeposit;
    
    @Transient
    private Double monthlySecurityDeposit;

}
