package com.stanzaliving.core.inventory_transformations.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Data
@Entity
@Table(name = "STUDENT_VERIFICATION")
public class StudentVerification implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "STUDENT_ID", insertable = false, nullable = false)
    private String studentId;

    @Column(name = "AADHAR", nullable = false)
    private Integer AADHAR = 0;

    @Column(name = "PAN", nullable = false)
    private Integer PAN = 0;

    @Column(name = "OTHER_ID", nullable = false)
    private Integer otherId = 0;

    @Column(name = "ACCOUNT_NUMBER", nullable = false)
    private Integer accountNumber = 0;

    @Column(name = "NOC", nullable = false)
    private Integer NOC = 0;

    @Column(name = "POLICE_VERIFICATION", nullable = false)
    private Integer policeVerification = 0;

    @Column(name = "USER_STATUS", nullable = false)
    private Integer userStatus = 0;

    @Column(name = "AADHAR_RR")
    private String aadharRr;

    @Column(name = "PAN_RR")
    private String panRr;

    @Column(name = "OTHER_ID_RR")
    private String otherIdRr;

    @Column(name = "ACCOUNT_NUMBER_RR")
    private String accountNumberRr;

    @Column(name = "NOC_RR")
    private String nocRr;

    @Column(name = "POLICE_VERIFICATION_RR")
    private String policeVerificationRr;

    
}