package com.stanzaliving.core.inventory_transformations.entity;

import com.fasterxml.jackson.annotation.JsonProperty;


import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;

@Table(name = "TEMPORARY_STUDENT")
@Entity
@Data
public class TemporaryStudentEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "TEMPORARY_STUDENT_ID", insertable = false, nullable = false)
	@JsonProperty("TEMPORARY_STUDENT_ID")
    private Integer temporaryStudentId;

    @Column(name = "ADDITIONAL_CONTACT_EMAIL")
	@JsonProperty("ADDITIONAL_CONTACT_EMAIL")
    private String additionalContactEmail;

    @Column(name = "ADDITIONAL_CONTACT_MOBILE")
	@JsonProperty("ADDITIONAL_CONTACT_MOBILE")
    private String additionalContactMobile;

    @Column(name = "ADDITIONAL_CONTACT_NAME")
	@JsonProperty("ADDITIONAL_CONTACT_NAME")
    private String additionalContactName;

    @Column(name = "ADDITIONAL_CONTACT_RELATION_TO_STUDENT")
	@JsonProperty("ADDITIONAL_CONTACT_RELATION_TO_STUDENT")
    private String additionalContactRelationToStudent;

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

    @Column(name = "DATE_OF_BIRTH")
	@JsonProperty("DATE_OF_BIRTH")
    private Timestamp dateOfBirth;

    @Column(name = "DESIGNATION")
	@JsonProperty("DESIGNATION")
    private String DESIGNATION;

    @Column(name = "EMAIL")
	@JsonProperty("EMAIL")
    private String EMAIL;

    @Column(name = "FIRST_NAME")
	@JsonProperty("FIRST_NAME")
    private String firstName;

    @Column(name = "GENDER")
	@JsonProperty("GENDER")
    private Integer GENDER;

    @Column(name = "LAST_NAME")
	@JsonProperty("LAST_NAME")
    private String lastName;

    @Column(name = "LOCAL_GUARDIAN_MOBILE")
	@JsonProperty("LOCAL_GUARDIAN_MOBILE")
    private String localGuardianMobile;

    @Column(name = "LOCAL_GUARDIAN_NAME")
	@JsonProperty("LOCAL_GUARDIAN_NAME")
    private String localGuardianName;

    @Column(name = "MEDICAL_CONDITIONS")
	@JsonProperty("MEDICAL_CONDITIONS")
    private String medicalConditions;

    @Column(name = "PHONE")
	@JsonProperty("PHONE")
    private String PHONE;

    @Column(name = "PRIMARY_GUARDIAN_EMAIL")
	@JsonProperty("PRIMARY_GUARDIAN_EMAIL")
    private String primaryGuardianEmail;

    @Column(name = "PRIMARY_GUARDIAN_MOBILE")
	@JsonProperty("PRIMARY_GUARDIAN_MOBILE")
    private String primaryGuardianMobile;

    @Column(name = "PRIMARY_GUARDIAN_NAME")
	@JsonProperty("PRIMARY_GUARDIAN_NAME")
    private String primaryGuardianName;

    @Column(name = "PRIMARY_GUARDIAN_RELATION_TO_STUDENT")
	@JsonProperty("PRIMARY_GUARDIAN_RELATION_TO_STUDENT")
    private String primaryGuardianRelationToStudent;

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

    @Column(name = "LOCAL_GUARDIAN_ADDRESS_ID")
	@JsonProperty("LOCAL_GUARDIAN_ADDRESS_ID")
    private Integer localGuardianAddressId;

    @Column(name = "FOOD_PREFERENCE")
	@JsonProperty("FOOD_PREFERENCE")
    private Integer foodPreference;

    @Column(name = "INVENTORY_ID")
	@JsonProperty("INVENTORY_ID")
    private Integer inventoryId;

    @Column(name = "QR_LINK")
	@JsonProperty("QR_LINK")
    private String qrLink;

    @Column(name = "COURSE_ID")
	@JsonProperty("COURSE_ID")
    private Integer courseId;

    @Column(name = "INSTITUTION_ID")
	@JsonProperty("INSTITUTION_ID")
    private Integer institutionId;

    @Column(name = "COUNTRY_ID")
	@JsonProperty("COUNTRY_ID")
    private Integer countryId = 100;

    @Column(name = "LOCAL_GUARDIAN_RELATION_TO_STUDENT")
	@JsonProperty("LOCAL_GUARDIAN_RELATION_TO_STUDENT")
    private String localGuardianRelationToStudent;

    @Column(name = "METADATA", columnDefinition = "json")
	@JsonProperty("METADATA")
    private String METADATA;

    
}