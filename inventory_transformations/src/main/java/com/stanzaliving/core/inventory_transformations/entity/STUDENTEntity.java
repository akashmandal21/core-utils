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
	@JsonProperty("student_id")
    private String studentId;

    @Column(name = "BLOOD_GROUP")
	@JsonProperty("blood_group")
    private Integer bloodGroup;

    @Column(name = "COACHING_CENTER")
	@JsonProperty("coaching_center")
    private String coachingCenter;

    @Column(name = "COMPANY_NAME")
	@JsonProperty("company_name")
    private String companyName;

    @Column(name = "COURSE")
	@JsonProperty("course")
    private String COURSE;

    @Column(name = "CREATED", nullable = false)
	@JsonProperty("created")
    private Timestamp CREATED;

    @Column(name = "DATE_OF_BIRTH", nullable = false)
	@JsonProperty("date_of_birth")
    private Timestamp dateOfBirth;

    @Column(name = "DESIGNATION")
	@JsonProperty("designation")
    private String DESIGNATION;

    @Column(name = "EMAIL", nullable = false)
	@JsonProperty("email")
    private String EMAIL;

    @Column(name = "FIRST_NAME", nullable = false)
	@JsonProperty("first_name")
    private String firstName;

    @Column(name = "GENDER", nullable = false)
	@JsonProperty("gender")
    private Integer GENDER;

    @Column(name = "LAST_NAME", nullable = false)
	@JsonProperty("last_name")
    private String lastName;

    @Column(name = "MEDICAL_CONDITIONS")
	@JsonProperty("medical_conditions")
    private String medicalConditions;

    @Column(name = "PHONE", nullable = false)
	@JsonProperty("phone")
    private String PHONE;

    @Column(name = "PROFESSION")
	@JsonProperty("profession")
    private Integer PROFESSION;

    @Column(name = "UPDATED", nullable = false)
	@JsonProperty("updated")
    private Timestamp UPDATED;

    @Column(name = "YEAR")
	@JsonProperty("year")
    private Integer YEAR;

    @Column(name = "STUDENT_ADDRESS_ID")
	@JsonProperty("student_address_id")
    private Integer studentAddressId;

    @Column(name = "DEGREE_ID")
	@JsonProperty("degree_id")
    private Integer degreeId;

    @Column(name = "EDUCATIONAL_INSTITUTION_ID")
	@JsonProperty("educational_institution_id")
    private Integer educationalInstitutionId;

    @Column(name = "HOME_TOWN")
	@JsonProperty("home_town")
    private Integer homeTown;

    @Column(name = "INSTITUTION_ID")
	@JsonProperty("institution_id")
    private Integer institutionId;

    @Column(name = "INVENTORY_ID")
	@JsonProperty("inventory_id")
    private Integer inventoryId;

    @Column(name = "FOOD_PREFERENCE", nullable = false)
	@JsonProperty("food_preference")
    private Integer foodPreference;

    @Column(name = "AGREEMENT_DOCUMENT_ID")
	@JsonProperty("agreement_document_id")
    private String agreementDocumentId;

    @Column(name = "AGREEMENT_URL")
	@JsonProperty("agreement_url")
    private String agreementUrl;

    @Column(name = "ADDENDUM_URL")
	@JsonProperty("addendum_url")
    private String addendumUrl;

    @Column(name = "QR_LINK")
	@JsonProperty("qr_link")
    private String qrLink;

    @Column(name = "COURSE_ID")
	@JsonProperty("course_id")
    private Integer courseId;

    @Column(name = "VA_NUMBER")
	@JsonProperty("va_number")
    private String vaNumber;

    @Column(name = "ADDENDUM_DOCUMENT_ID")
	@JsonProperty("addendum_document_id")
    private String addendumDocumentId;

    @Column(name = "IMAGE")
	@JsonProperty("image")
    private String IMAGE;

    @Column(name = "COUNTRY_ID")
	@JsonProperty("country_id")
    private Integer countryId = 100;

    @Column(name = "UUID")
	@JsonProperty("uuid")
    private String UUID;

    @Column(name = "STUDENT_QR_CODE")
	@JsonProperty("student_qr_code")
    private String studentQrCode;

    
}