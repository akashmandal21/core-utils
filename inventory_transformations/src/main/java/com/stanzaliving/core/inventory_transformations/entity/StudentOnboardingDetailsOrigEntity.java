package com.stanzaliving.core.inventory_transformations.entity;

import com.fasterxml.jackson.annotation.JsonProperty;


import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.sql.Timestamp;

@Data
@Entity
@Table(name = "STUDENT_ONBOARDING_DETAILS_ORIG")
public class StudentOnboardingDetailsOrigEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "STUDENT_ID", insertable = false, nullable = false)
	@JsonProperty("STUDENT_ID")
    private String studentId;

    @Column(name = "AADHAR")
	@JsonProperty("AADHAR")
    private String AADHAR;

    @Column(name = "AADHAR_PHOTO")
	@JsonProperty("AADHAR_PHOTO")
    private String aadharPhoto;

    @Column(name = "ACCOUNT_NAME")
	@JsonProperty("ACCOUNT_NAME")
    private String accountName;

    @Column(name = "ACCOUNT_NUMBER")
	@JsonProperty("ACCOUNT_NUMBER")
    private String accountNumber;

    @Column(name = "BIOMETRIC_ID")
	@JsonProperty("BIOMETRIC_ID")
    private String biometricId;

    @Column(name = "CANCELLED_CHEQUE")
	@JsonProperty("CANCELLED_CHEQUE")
    private String cancelledCheque;

    @Column(name = "CREATED", nullable = false)
	@JsonProperty("CREATED")
    private Timestamp CREATED;

    @Column(name = "IFSC_CODE")
	@JsonProperty("IFSC_CODE")
    private String ifscCode;

    @Column(name = "NOC")
	@JsonProperty("NOC")
    private String NOC;

    @Column(name = "OTHER_ID")
	@JsonProperty("OTHER_ID")
    private String otherId;

    @Column(name = "OTHER_ID_PHOTO")
	@JsonProperty("OTHER_ID_PHOTO")
    private String otherIdPhoto;

    @Column(name = "PAN_CARD")
	@JsonProperty("PAN_CARD")
    private String panCard;

    @Column(name = "PAN_CARD_PHOTO")
	@JsonProperty("PAN_CARD_PHOTO")
    private String panCardPhoto;

    @Column(name = "POLICE_VERIFICATION")
	@JsonProperty("POLICE_VERIFICATION")
    private String policeVerification;

    @Column(name = "STATUS")
	@JsonProperty("STATUS")
    private String STATUS;

    @Column(name = "UPDATED", nullable = false)
	@JsonProperty("UPDATED")
    private Timestamp UPDATED;

    @Column(name = "PAN_TYPE")
	@JsonProperty("PAN_TYPE")
    private String panType;

    @Column(name = "CREATED_BY")
	@JsonProperty("CREATED_BY")
    private String createdBy;

    @Column(name = "ELEC_METER_READING")
	@JsonProperty("ELEC_METER_READING")
    private Integer elecMeterReading = 0;

    @Column(name = "COMMENTS")
	@JsonProperty("COMMENTS")
    private String COMMENTS;

    
}