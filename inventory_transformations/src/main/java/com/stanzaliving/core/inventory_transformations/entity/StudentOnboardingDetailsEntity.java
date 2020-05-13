package com.stanzaliving.core.inventory_transformations.entity;

import com.fasterxml.jackson.annotation.JsonProperty;


import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;

@Entity
@Table(name = "STUDENT_ONBOARDING_DETAILS")
@Data
public class StudentOnboardingDetailsEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", insertable = false, nullable = false)
	@JsonProperty("id")
    private Integer ID;

    @Column(name = "STUDENT_ID", nullable = false)
	@JsonProperty("student_id")
    private String studentId;

    @Column(name = "AADHAR")
	@JsonProperty("aadhar")
    private String AADHAR;

    @Column(name = "AADHAR_PHOTO")
	@JsonProperty("aadhar_photo")
    private String aadharPhoto;

    @Column(name = "ACCOUNT_NAME")
	@JsonProperty("account_name")
    private String accountName;

    @Column(name = "ACCOUNT_NUMBER")
	@JsonProperty("account_number")
    private String accountNumber;

    @Column(name = "BIOMETRIC_ID")
	@JsonProperty("biometric_id")
    private String biometricId;

    @Column(name = "CANCELLED_CHEQUE")
	@JsonProperty("cancelled_cheque")
    private String cancelledCheque;

    @Column(name = "CREATED", nullable = false)
	@JsonProperty("created")
    private Timestamp CREATED;

    @Column(name = "IFSC_CODE")
	@JsonProperty("ifsc_code")
    private String ifscCode;

    @Column(name = "NOC")
	@JsonProperty("noc")
    private String NOC;

    @Column(name = "OTHER_ID")
	@JsonProperty("other_id")
    private String otherId;

    @Column(name = "OTHER_ID_PHOTO")
	@JsonProperty("other_id_photo")
    private String otherIdPhoto;

    @Column(name = "PAN_CARD")
	@JsonProperty("pan_card")
    private String panCard;

    @Column(name = "PAN_CARD_PHOTO")
	@JsonProperty("pan_card_photo")
    private String panCardPhoto;

    @Column(name = "POLICE_VERIFICATION")
	@JsonProperty("police_verification")
    private String policeVerification;

    @Column(name = "STATUS")
	@JsonProperty("status")
    private String STATUS;

    @Column(name = "UPDATED", nullable = false)
	@JsonProperty("updated")
    private Timestamp UPDATED;

    @Column(name = "PAN_TYPE")
	@JsonProperty("pan_type")
    private String panType;

    @Column(name = "CREATED_BY")
	@JsonProperty("created_by")
    private String createdBy;

    @Column(name = "ELEC_METER_READING")
	@JsonProperty("elec_meter_reading")
    private Integer elecMeterReading = 0;

    @Column(name = "COMMENTS")
	@JsonProperty("comments")
    private String COMMENTS;

    @Column(name = "BOOKING_ID")
	@JsonProperty("booking_id")
    private Integer bookingId;

    
}