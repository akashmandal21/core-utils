package com.stanzaliving.core.inventory_transformations.entity;

import com.fasterxml.jackson.annotation.JsonProperty;


import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "STUDENT_VERIFICATION")
@Data
public class StudentVerificationEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "STUDENT_ID", insertable = false, nullable = false)
	@JsonProperty("student_id")
    private String studentId;

    @Column(name = "AADHAR", nullable = false)
	@JsonProperty("aadhar")
    private Integer AADHAR = 0;

    @Column(name = "PAN", nullable = false)
	@JsonProperty("pan")
    private Integer PAN = 0;

    @Column(name = "OTHER_ID", nullable = false)
	@JsonProperty("other_id")
    private Integer otherId = 0;

    @Column(name = "ACCOUNT_NUMBER", nullable = false)
	@JsonProperty("account_number")
    private Integer accountNumber = 0;

    @Column(name = "NOC", nullable = false)
	@JsonProperty("noc")
    private Integer NOC = 0;

    @Column(name = "POLICE_VERIFICATION", nullable = false)
	@JsonProperty("police_verification")
    private Integer policeVerification = 0;

    @Column(name = "USER_STATUS", nullable = false)
	@JsonProperty("user_status")
    private Integer userStatus = 0;

    @Column(name = "AADHAR_RR")
	@JsonProperty("aadhar_rr")
    private String aadharRr;

    @Column(name = "PAN_RR")
	@JsonProperty("pan_rr")
    private String panRr;

    @Column(name = "OTHER_ID_RR")
	@JsonProperty("other_id_rr")
    private String otherIdRr;

    @Column(name = "ACCOUNT_NUMBER_RR")
	@JsonProperty("account_number_rr")
    private String accountNumberRr;

    @Column(name = "NOC_RR")
	@JsonProperty("noc_rr")
    private String nocRr;

    @Column(name = "POLICE_VERIFICATION_RR")
	@JsonProperty("police_verification_rr")
    private String policeVerificationRr;

    
}