package com.stanzaliving.core.inventory_transformations.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.time.LocalDateTime;

@Table(name = "STUDENT")
@Entity
@Data
public class STUDENT implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "STUDENT_ID", insertable = false, nullable = false)
    private String studentId;

    @Column(name = "BLOOD_GROUP")
    private Integer bloodGroup;

    @Column(name = "COACHING_CENTER")
    private String coachingCenter;

    @Column(name = "COMPANY_NAME")
    private String companyName;

    @Column(name = "COURSE")
    private String COURSE;

    @Column(name = "CREATED", nullable = false)
    private LocalDateTime CREATED;

    @Column(name = "DATE_OF_BIRTH", nullable = false)
    private LocalDateTime dateOfBirth;

    @Column(name = "DESIGNATION")
    private String DESIGNATION;

    @Column(name = "EMAIL", nullable = false)
    private String EMAIL;

    @Column(name = "FIRST_NAME", nullable = false)
    private String firstName;

    @Column(name = "GENDER", nullable = false)
    private Integer GENDER;

    @Column(name = "LAST_NAME", nullable = false)
    private String lastName;

    @Column(name = "MEDICAL_CONDITIONS")
    private String medicalConditions;

    @Column(name = "PHONE", nullable = false)
    private String PHONE;

    @Column(name = "PROFESSION")
    private Integer PROFESSION;

    @Column(name = "UPDATED", nullable = false)
    private LocalDateTime UPDATED;

    @Column(name = "YEAR")
    private Integer YEAR;

    @Column(name = "STUDENT_ADDRESS_ID")
    private Integer studentAddressId;

    @Column(name = "DEGREE_ID")
    private Integer degreeId;

    @Column(name = "EDUCATIONAL_INSTITUTION_ID")
    private Integer educationalInstitutionId;

    @Column(name = "HOME_TOWN")
    private Integer homeTown;

    @Column(name = "INSTITUTION_ID")
    private Integer institutionId;

    @Column(name = "INVENTORY_ID")
    private Integer inventoryId;

    @Column(name = "FOOD_PREFERENCE", nullable = false)
    private Integer foodPreference;

    @Column(name = "AGREEMENT_DOCUMENT_ID")
    private String agreementDocumentId;

    @Column(name = "AGREEMENT_URL")
    private String agreementUrl;

    @Column(name = "ADDENDUM_URL")
    private String addendumUrl;

    @Column(name = "QR_LINK")
    private String qrLink;

    @Column(name = "COURSE_ID")
    private Integer courseId;

    @Column(name = "VA_NUMBER")
    private String vaNumber;

    @Column(name = "ADDENDUM_DOCUMENT_ID")
    private String addendumDocumentId;

    @Column(name = "IMAGE")
    private String IMAGE;

    @Column(name = "COUNTRY_ID")
    private Integer countryId = 100;

    @Column(name = "UUID")
    private String UUID;

    @Column(name = "STUDENT_QR_CODE")
    private String studentQrCode;

    
}