package com.stanzaliving.core.inventory_transformations.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.time.LocalDateTime;

@Table(name = "STUDENT_ONBOARDING_DETAILS_ORIG")
@Data
@Entity
public class StudentOnboardingDetailsOrig implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "STUDENT_ID", insertable = false, nullable = false)
    private String studentId;

    @Column(name = "AADHAR")
    private String AADHAR;

    @Column(name = "AADHAR_PHOTO")
    private String aadharPhoto;

    @Column(name = "ACCOUNT_NAME")
    private String accountName;

    @Column(name = "ACCOUNT_NUMBER")
    private String accountNumber;

    @Column(name = "BIOMETRIC_ID")
    private String biometricId;

    @Column(name = "CANCELLED_CHEQUE")
    private String cancelledCheque;

    @Column(name = "CREATED", nullable = false)
    private LocalDateTime CREATED;

    @Column(name = "IFSC_CODE")
    private String ifscCode;

    @Column(name = "NOC")
    private String NOC;

    @Column(name = "OTHER_ID")
    private String otherId;

    @Column(name = "OTHER_ID_PHOTO")
    private String otherIdPhoto;

    @Column(name = "PAN_CARD")
    private String panCard;

    @Column(name = "PAN_CARD_PHOTO")
    private String panCardPhoto;

    @Column(name = "POLICE_VERIFICATION")
    private String policeVerification;

    @Column(name = "STATUS")
    private String STATUS;

    @Column(name = "UPDATED", nullable = false)
    private LocalDateTime UPDATED;

    @Column(name = "PAN_TYPE")
    private String panType;

    @Column(name = "CREATED_BY")
    private String createdBy;

    @Column(name = "ELEC_METER_READING")
    private Integer elecMeterReading = 0;

    @Column(name = "COMMENTS")
    private String COMMENTS;

    
}