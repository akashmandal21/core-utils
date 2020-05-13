package com.stanzaliving.core.inventory_transformations.entity;

import com.fasterxml.jackson.annotation.JsonProperty;


import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;

@Entity
@Table(name = "RESIDENCE")
@Data
public class ResidenceEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "RESIDENCE_ID", insertable = false, nullable = false)
	@JsonProperty("residence_id")
    private Integer residenceId;

    @Column(name = "CODE", nullable = false)
	@JsonProperty("code")
    private String CODE;

    @Column(name = "CREATED", nullable = false)
	@JsonProperty("created")
    private Timestamp CREATED;

    @Column(name = "ENABLED", nullable = false)
	@JsonProperty("enabled")
    private Boolean ENABLED;

    @Column(name = "GENDER", nullable = false)
	@JsonProperty("gender")
    private Integer GENDER;

    @Column(name = "NAME", nullable = false)
	@JsonProperty("name")
    private String NAME;

    @Column(name = "UPDATED", nullable = false)
	@JsonProperty("updated")
    private Timestamp UPDATED;

    @Column(name = "RESIDENCE_ADDRESS_ID")
	@JsonProperty("residence_address_id")
    private Integer residenceAddressId;

    @Column(name = "MICROMARKET_ID")
	@JsonProperty("micromarket_id")
    private Integer micromarketId;

    @Column(name = "DETAILS_COMPLETED", nullable = false)
	@JsonProperty("details_completed")
    private Boolean detailsCompleted;

    @Column(name = "BUFFER_PRICE")
	@JsonProperty("buffer_price")
    private Integer bufferPrice;

    @Column(name = "PREVIOUS_ALIAS")
	@JsonProperty("previous_alias")
    private String previousAlias;

    @Column(name = "ADMIN_CHARGES")
	@JsonProperty("admin_charges")
    private Integer adminCharges;

    @Column(name = "NON_REFUNDABLE_SECURITY_DEPOSIT")
	@JsonProperty("non_refundable_security_deposit")
    private Integer nonRefundableSecurityDeposit;

    @Column(name = "REFUNDABLE_SECURITY_DEPOSIT")
	@JsonProperty("refundable_security_deposit")
    private Integer refundableSecurityDeposit;

    @Column(name = "ADVANCE_RENTAL")
	@JsonProperty("advance_rental")
    private Integer advanceRental;

    @Column(name = "CGST")
	@JsonProperty("cgst")
    private Double CGST;

    @Column(name = "GST_IN")
	@JsonProperty("gst_in")
    private String gstIn;

    @Column(name = "IGST")
	@JsonProperty("igst")
    private Double IGST;

    @Column(name = "INTERNATIONAL_STUDENT_ALLOWED")
	@JsonProperty("international_student_allowed")
    private Boolean internationalStudentAllowed;

    @Column(name = "RETENTION_BOOKING_AMOUNT")
	@JsonProperty("retention_booking_amount")
    private Double retentionBookingAmount;

    @Column(name = "SGST")
	@JsonProperty("sgst")
    private Double SGST;

    @Column(name = "HOSTEL_ID")
	@JsonProperty("hostel_id")
    private Integer hostelId;

    @Column(name = "RESIDENCE_RC_ID")
	@JsonProperty("residence_rc_id")
    private Integer residenceRcId = 155;

    @Column(name = "RESIDENCE_SUPPLEMENTARY_DETAIL_ID")
	@JsonProperty("residence_supplementary_detail_id")
    private Integer residenceSupplementaryDetailId = 1;

    @Column(name = "PROPERTY_TYPE", nullable = false)
	@JsonProperty("property_type")
    private Integer propertyType;

    @Column(name = "PROPERTY_CATEGORY", nullable = false)
	@JsonProperty("property_category")
    private Integer propertyCategory;

    @Column(name = "IS_TEST_HOUSE", columnDefinition = "tinyint")
	@JsonProperty("is_test_house")
    private Integer testHouse = 0;

    @Column(name = "PARENT_COMPANY", nullable = false)
	@JsonProperty("parent_company")
    private Integer parentCompany = 0;

    @Column(name = "ROFR")
	@JsonProperty("rofr")
    private Boolean ROFR = Boolean.FALSE;

    @Column(name = "AUTO_CANCELLATION_DAYS")
	@JsonProperty("auto_cancellation_days")
    private Integer autoCancellationDays = 7;

    
}