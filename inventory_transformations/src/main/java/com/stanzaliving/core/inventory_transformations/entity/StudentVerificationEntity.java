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
	@JsonProperty("STUDENT_ID")
    private String studentId;

    @Column(name = "AADHAR", nullable = false)
	@JsonProperty("AADHAR")
    private Integer AADHAR = 0;

    @Column(name = "PAN", nullable = false)
	@JsonProperty("PAN")
    private Integer PAN = 0;

    @Column(name = "OTHER_ID", nullable = false)
	@JsonProperty("OTHER_ID")
    private Integer otherId = 0;

    @Column(name = "ACCOUNT_NUMBER", nullable = false)
	@JsonProperty("ACCOUNT_NUMBER")
    private Integer accountNumber = 0;

    @Column(name = "NOC", nullable = false)
	@JsonProperty("NOC")
    private Integer NOC = 0;

    @Column(name = "POLICE_VERIFICATION", nullable = false)
	@JsonProperty("POLICE_VERIFICATION")
    private Integer policeVerification = 0;

    @Column(name = "USER_STATUS", nullable = false)
	@JsonProperty("USER_STATUS")
    private Integer userStatus = 0;

    @Column(name = "AADHAR_RR")
	@JsonProperty("AADHAR_RR")
    private String aadharRr;

    @Column(name = "PAN_RR")
	@JsonProperty("PAN_RR")
    private String panRr;

    @Column(name = "OTHER_ID_RR")
	@JsonProperty("OTHER_ID_RR")
    private String otherIdRr;

    @Column(name = "ACCOUNT_NUMBER_RR")
	@JsonProperty("ACCOUNT_NUMBER_RR")
    private String accountNumberRr;

    @Column(name = "NOC_RR")
	@JsonProperty("NOC_RR")
    private String nocRr;

    @Column(name = "POLICE_VERIFICATION_RR")
	@JsonProperty("POLICE_VERIFICATION_RR")
    private String policeVerificationRr;

    
}