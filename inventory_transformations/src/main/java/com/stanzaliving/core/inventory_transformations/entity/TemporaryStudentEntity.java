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
	@JsonProperty("temporary_student_id")
    private Integer temporaryStudentId;

    @Column(name = "ADDITIONAL_CONTACT_EMAIL")
	@JsonProperty("additional_contact_email")
    private String additionalContactEmail;

    @Column(name = "ADDITIONAL_CONTACT_MOBILE")
	@JsonProperty("additional_contact_mobile")
    private String additionalContactMobile;

    @Column(name = "ADDITIONAL_CONTACT_NAME")
	@JsonProperty("additional_contact_name")
    private String additionalContactName;

    @Column(name = "ADDITIONAL_CONTACT_RELATION_TO_STUDENT")
	@JsonProperty("additional_contact_relation_to_student")
    private String additionalContactRelationToStudent;

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

    @Column(name = "DATE_OF_BIRTH")
	@JsonProperty("date_of_birth")
    private Timestamp dateOfBirth;

    @Column(name = "DESIGNATION")
	@JsonProperty("designation")
    private String DESIGNATION;

    @Column(name = "EMAIL")
	@JsonProperty("email")
    private String EMAIL;

    @Column(name = "FIRST_NAME")
	@JsonProperty("first_name")
    private String firstName;

    @Column(name = "GENDER")
	@JsonProperty("gender")
    private Integer GENDER;

    @Column(name = "LAST_NAME")
	@JsonProperty("last_name")
    private String lastName;

    @Column(name = "LOCAL_GUARDIAN_MOBILE")
	@JsonProperty("local_guardian_mobile")
    private String localGuardianMobile;

    @Column(name = "LOCAL_GUARDIAN_NAME")
	@JsonProperty("local_guardian_name")
    private String localGuardianName;

    @Column(name = "MEDICAL_CONDITIONS")
	@JsonProperty("medical_conditions")
    private String medicalConditions;

    @Column(name = "PHONE")
	@JsonProperty("phone")
    private String PHONE;

    @Column(name = "PRIMARY_GUARDIAN_EMAIL")
	@JsonProperty("primary_guardian_email")
    private String primaryGuardianEmail;

    @Column(name = "PRIMARY_GUARDIAN_MOBILE")
	@JsonProperty("primary_guardian_mobile")
    private String primaryGuardianMobile;

    @Column(name = "PRIMARY_GUARDIAN_NAME")
	@JsonProperty("primary_guardian_name")
    private String primaryGuardianName;

    @Column(name = "PRIMARY_GUARDIAN_RELATION_TO_STUDENT")
	@JsonProperty("primary_guardian_relation_to_student")
    private String primaryGuardianRelationToStudent;

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

    @Column(name = "LOCAL_GUARDIAN_ADDRESS_ID")
	@JsonProperty("local_guardian_address_id")
    private Integer localGuardianAddressId;

    @Column(name = "FOOD_PREFERENCE")
	@JsonProperty("food_preference")
    private Integer foodPreference;

    @Column(name = "INVENTORY_ID")
	@JsonProperty("inventory_id")
    private Integer inventoryId;

    @Column(name = "QR_LINK")
	@JsonProperty("qr_link")
    private String qrLink;

    @Column(name = "COURSE_ID")
	@JsonProperty("course_id")
    private Integer courseId;

    @Column(name = "INSTITUTION_ID")
	@JsonProperty("institution_id")
    private Integer institutionId;

    @Column(name = "COUNTRY_ID")
	@JsonProperty("country_id")
    private Integer countryId = 100;

    @Column(name = "LOCAL_GUARDIAN_RELATION_TO_STUDENT")
	@JsonProperty("local_guardian_relation_to_student")
    private String localGuardianRelationToStudent;

    @Column(name = "METADATA", columnDefinition = "json")
	@JsonProperty("metadata")
    private String METADATA;

    
}