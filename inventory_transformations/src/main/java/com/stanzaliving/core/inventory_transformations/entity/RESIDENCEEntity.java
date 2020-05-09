package com.stanzaliving.core.inventory_transformations.entity;

import com.fasterxml.jackson.annotation.JsonProperty;


import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;

@Entity
@Table(name = "RESIDENCE")
@Data
public class RESIDENCEEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "RESIDENCE_ID", insertable = false, nullable = false)
	@JsonProperty("RESIDENCE_ID")
    private Integer residenceId;

    @Column(name = "CODE", nullable = false)
	@JsonProperty("CODE")
    private String CODE;

    @Column(name = "CREATED", nullable = false)
	@JsonProperty("CREATED")
    private Timestamp CREATED;

    @Column(name = "ENABLED", nullable = false)
	@JsonProperty("ENABLED")
    private Boolean ENABLED;

    @Column(name = "GENDER", nullable = false)
	@JsonProperty("GENDER")
    private Integer GENDER;

    @Column(name = "NAME", nullable = false)
	@JsonProperty("NAME")
    private String NAME;

    @Column(name = "UPDATED", nullable = false)
	@JsonProperty("UPDATED")
    private Timestamp UPDATED;

    @Column(name = "RESIDENCE_ADDRESS_ID")
	@JsonProperty("RESIDENCE_ADDRESS_ID")
    private Integer residenceAddressId;

    @Column(name = "MICROMARKET_ID")
	@JsonProperty("MICROMARKET_ID")
    private Integer micromarketId;

    @Column(name = "DETAILS_COMPLETED", nullable = false)
	@JsonProperty("DETAILS_COMPLETED")
    private Boolean detailsCompleted;

    @Column(name = "BUFFER_PRICE")
	@JsonProperty("BUFFER_PRICE")
    private Integer bufferPrice;

    @Column(name = "PREVIOUS_ALIAS")
	@JsonProperty("PREVIOUS_ALIAS")
    private String previousAlias;

    @Column(name = "ADMIN_CHARGES")
	@JsonProperty("ADMIN_CHARGES")
    private Integer adminCharges;

    @Column(name = "NON_REFUNDABLE_SECURITY_DEPOSIT")
	@JsonProperty("NON_REFUNDABLE_SECURITY_DEPOSIT")
    private Integer nonRefundableSecurityDeposit;

    @Column(name = "REFUNDABLE_SECURITY_DEPOSIT")
	@JsonProperty("REFUNDABLE_SECURITY_DEPOSIT")
    private Integer refundableSecurityDeposit;

    @Column(name = "ADVANCE_RENTAL")
	@JsonProperty("ADVANCE_RENTAL")
    private Integer advanceRental;

    @Column(name = "CGST")
	@JsonProperty("CGST")
    private Double CGST;

    @Column(name = "GST_IN")
	@JsonProperty("GST_IN")
    private String gstIn;

    @Column(name = "IGST")
	@JsonProperty("IGST")
    private Double IGST;

    @Column(name = "INTERNATIONAL_STUDENT_ALLOWED")
	@JsonProperty("INTERNATIONAL_STUDENT_ALLOWED")
    private Boolean internationalStudentAllowed;

    @Column(name = "RETENTION_BOOKING_AMOUNT")
	@JsonProperty("RETENTION_BOOKING_AMOUNT")
    private Double retentionBookingAmount;

    @Column(name = "SGST")
	@JsonProperty("SGST")
    private Double SGST;

    @Column(name = "HOSTEL_ID")
	@JsonProperty("HOSTEL_ID")
    private Integer hostelId;

    @Column(name = "RESIDENCE_RC_ID")
	@JsonProperty("RESIDENCE_RC_ID")
    private Integer residenceRcId = 155;

    @Column(name = "RESIDENCE_SUPPLEMENTARY_DETAIL_ID")
	@JsonProperty("RESIDENCE_SUPPLEMENTARY_DETAIL_ID")
    private Integer residenceSupplementaryDetailId = 1;

    @Column(name = "PROPERTY_TYPE", nullable = false)
	@JsonProperty("PROPERTY_TYPE")
    private Integer propertyType;

    @Column(name = "PROPERTY_CATEGORY", nullable = false)
	@JsonProperty("PROPERTY_CATEGORY")
    private Integer propertyCategory;

    @Column(name = "IS_TEST_HOUSE", columnDefinition = "tinyint")
	@JsonProperty("IS_TEST_HOUSE")
    private Integer testHouse = 0;

    @Column(name = "PARENT_COMPANY", nullable = false)
	@JsonProperty("PARENT_COMPANY")
    private Integer parentCompany = 0;

    @Column(name = "ROFR")
	@JsonProperty("ROFR")
    private Boolean ROFR = Boolean.FALSE;

    @Column(name = "AUTO_CANCELLATION_DAYS")
	@JsonProperty("AUTO_CANCELLATION_DAYS")
    private Integer autoCancellationDays = 7;

    
}