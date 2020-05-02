package com.stanzaliving.core.inventory_transformations.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Data
@Table(name = "RESIDENCE")
public class RESIDENCE implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "RESIDENCE_ID", insertable = false, nullable = false)
    private Integer residenceId;

    @Column(name = "CODE", nullable = false)
    private String CODE;

    @Column(name = "CREATED", nullable = false)
    private LocalDateTime CREATED;

    @Column(name = "ENABLED", nullable = false)
    private Boolean ENABLED;

    @Column(name = "GENDER", nullable = false)
    private Integer GENDER;

    @Column(name = "NAME", nullable = false)
    private String NAME;

    @Column(name = "UPDATED", nullable = false)
    private LocalDateTime UPDATED;

    @Column(name = "RESIDENCE_ADDRESS_ID")
    private Integer residenceAddressId;

    @Column(name = "MICROMARKET_ID")
    private Integer micromarketId;

    @Column(name = "DETAILS_COMPLETED", nullable = false)
    private Boolean detailsCompleted;

    @Column(name = "BUFFER_PRICE")
    private Integer bufferPrice;

    @Column(name = "PREVIOUS_ALIAS")
    private String previousAlias;

    @Column(name = "ADMIN_CHARGES")
    private Integer adminCharges;

    @Column(name = "NON_REFUNDABLE_SECURITY_DEPOSIT")
    private Integer nonRefundableSecurityDeposit;

    @Column(name = "REFUNDABLE_SECURITY_DEPOSIT")
    private Integer refundableSecurityDeposit;

    @Column(name = "ADVANCE_RENTAL")
    private Integer advanceRental;

    @Column(name = "CGST")
    private Double CGST;

    @Column(name = "GST_IN")
    private String gstIn;

    @Column(name = "IGST")
    private Double IGST;

    @Column(name = "INTERNATIONAL_STUDENT_ALLOWED")
    private Boolean internationalStudentAllowed;

    @Column(name = "RETENTION_BOOKING_AMOUNT")
    private Double retentionBookingAmount;

    @Column(name = "SGST")
    private Double SGST;

    @Column(name = "HOSTEL_ID")
    private Integer hostelId;

    @Column(name = "RESIDENCE_RC_ID")
    private Integer residenceRcId = 155;

    @Column(name = "RESIDENCE_SUPPLEMENTARY_DETAIL_ID")
    private Integer residenceSupplementaryDetailId = 1;

    @Column(name = "PROPERTY_TYPE", nullable = false)
    private Integer propertyType;

    @Column(name = "PROPERTY_CATEGORY", nullable = false)
    private Integer propertyCategory;

    @Column(name = "IS_TEST_HOUSE")
    private Integer testHouse = 0;

    @Column(name = "PARENT_COMPANY", nullable = false)
    private Integer parentCompany = 0;

    @Column(name = "ROFR")
    private Boolean ROFR = Boolean.FALSE;

    @Column(name = "AUTO_CANCELLATION_DAYS")
    private Integer autoCancellationDays = 7;

    
}