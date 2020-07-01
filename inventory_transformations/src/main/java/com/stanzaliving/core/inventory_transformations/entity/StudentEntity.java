package com.stanzaliving.core.inventory_transformations.entity;

import com.fasterxml.jackson.annotation.JsonProperty;


import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.sql.Timestamp;

@Entity
@Table(name = "STUDENT")
@Data
public class StudentEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "STUDENT_ID", insertable = false, nullable = false)
	@JsonProperty("STUDENT_ID")
    private String studentId;

    @Column(name = "BLOOD_GROUP")
	@JsonProperty("BLOOD_GROUP")
    private Integer bloodGroup;

    @Column(name = "COACHING_CENTER")
	@JsonProperty("COACHING_CENTER")
    private String coachingCenter;

    @Column(name = "COMPANY_NAME")
	@JsonProperty("COMPANY_NAME")
    private String companyName;

    @Column(name = "COURSE")
	@JsonProperty("COURSE")
    private String COURSE;

    @Column(name = "CREATED", nullable = false)
	@JsonProperty("CREATED")
    private Timestamp CREATED;

    @Column(name = "DATE_OF_BIRTH", nullable = false)
	@JsonProperty("DATE_OF_BIRTH")
    private Timestamp dateOfBirth;

    @Column(name = "DESIGNATION")
	@JsonProperty("DESIGNATION")
    private String DESIGNATION;

    @Column(name = "EMAIL", nullable = false)
	@JsonProperty("EMAIL")
    private String EMAIL;

    @Column(name = "FIRST_NAME", nullable = false)
	@JsonProperty("FIRST_NAME")
    private String firstName;

    @Column(name = "GENDER", nullable = false)
	@JsonProperty("GENDER")
    private Integer GENDER;

    @Column(name = "LAST_NAME", nullable = false)
	@JsonProperty("LAST_NAME")
    private String lastName;

    @Column(name = "MEDICAL_CONDITIONS")
	@JsonProperty("MEDICAL_CONDITIONS")
    private String medicalConditions;

    @Column(name = "PHONE", nullable = false)
	@JsonProperty("PHONE")
    private String PHONE;

    @Column(name = "PROFESSION")
	@JsonProperty("PROFESSION")
    private Integer PROFESSION;

    @Column(name = "UPDATED", nullable = false)
	@JsonProperty("UPDATED")
    private Timestamp UPDATED;

    @Column(name = "YEAR")
	@JsonProperty("YEAR")
    private Integer YEAR;

    @Column(name = "STUDENT_ADDRESS_ID")
	@JsonProperty("STUDENT_ADDRESS_ID")
    private Integer studentAddressId;

    @Column(name = "DEGREE_ID")
	@JsonProperty("DEGREE_ID")
    private Integer degreeId;

    @Column(name = "EDUCATIONAL_INSTITUTION_ID")
	@JsonProperty("EDUCATIONAL_INSTITUTION_ID")
    private Integer educationalInstitutionId;

    @Column(name = "HOME_TOWN")
	@JsonProperty("HOME_TOWN")
    private Integer homeTown;

    @Column(name = "INSTITUTION_ID")
	@JsonProperty("INSTITUTION_ID")
    private Integer institutionId;

    @Column(name = "INVENTORY_ID")
	@JsonProperty("INVENTORY_ID")
    private Integer inventoryId;

    @Column(name = "FOOD_PREFERENCE", nullable = false)
	@JsonProperty("FOOD_PREFERENCE")
    private Integer foodPreference;

    @Column(name = "AGREEMENT_DOCUMENT_ID")
	@JsonProperty("AGREEMENT_DOCUMENT_ID")
    private String agreementDocumentId;

    @Column(name = "AGREEMENT_URL")
	@JsonProperty("AGREEMENT_URL")
    private String agreementUrl;

    @Column(name = "ADDENDUM_URL")
	@JsonProperty("ADDENDUM_URL")
    private String addendumUrl;

    @Column(name = "QR_LINK")
	@JsonProperty("QR_LINK")
    private String qrLink;

    @Column(name = "COURSE_ID")
	@JsonProperty("COURSE_ID")
    private Integer courseId;

    @Column(name = "VA_NUMBER")
	@JsonProperty("VA_NUMBER")
    private String vaNumber;

    @Column(name = "ADDENDUM_DOCUMENT_ID")
	@JsonProperty("ADDENDUM_DOCUMENT_ID")
    private String addendumDocumentId;

    @Column(name = "IMAGE")
	@JsonProperty("IMAGE")
    private String IMAGE;

    @Column(name = "COUNTRY_ID")
	@JsonProperty("COUNTRY_ID")
    private Integer countryId = 100;

    @Column(name = "UUID")
	@JsonProperty("UUID")
    private String UUID;

    @Column(name = "STUDENT_QR_CODE")
	@JsonProperty("STUDENT_QR_CODE")
    private String studentQrCode;

    
}