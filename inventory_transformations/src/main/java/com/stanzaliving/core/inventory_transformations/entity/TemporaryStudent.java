package com.stanzaliving.core.inventory_transformations.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "TEMPORARY_STUDENT")
public class TemporaryStudent implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "TEMPORARY_STUDENT_ID", insertable = false, nullable = false)
    private Integer temporaryStudentId;

    @Column(name = "ADDITIONAL_CONTACT_EMAIL")
    private String additionalContactEmail;

    @Column(name = "ADDITIONAL_CONTACT_MOBILE")
    private String additionalContactMobile;

    @Column(name = "ADDITIONAL_CONTACT_NAME")
    private String additionalContactName;

    @Column(name = "ADDITIONAL_CONTACT_RELATION_TO_STUDENT")
    private String additionalContactRelationToStudent;

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

    @Column(name = "DATE_OF_BIRTH")
    private LocalDateTime dateOfBirth;

    @Column(name = "DESIGNATION")
    private String DESIGNATION;

    @Column(name = "EMAIL")
    private String EMAIL;

    @Column(name = "FIRST_NAME")
    private String firstName;

    @Column(name = "GENDER")
    private Integer GENDER;

    @Column(name = "LAST_NAME")
    private String lastName;

    @Column(name = "LOCAL_GUARDIAN_MOBILE")
    private String localGuardianMobile;

    @Column(name = "LOCAL_GUARDIAN_NAME")
    private String localGuardianName;

    @Column(name = "MEDICAL_CONDITIONS")
    private String medicalConditions;

    @Column(name = "PHONE")
    private String PHONE;

    @Column(name = "PRIMARY_GUARDIAN_EMAIL")
    private String primaryGuardianEmail;

    @Column(name = "PRIMARY_GUARDIAN_MOBILE")
    private String primaryGuardianMobile;

    @Column(name = "PRIMARY_GUARDIAN_NAME")
    private String primaryGuardianName;

    @Column(name = "PRIMARY_GUARDIAN_RELATION_TO_STUDENT")
    private String primaryGuardianRelationToStudent;

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

    @Column(name = "LOCAL_GUARDIAN_ADDRESS_ID")
    private Integer localGuardianAddressId;

    @Column(name = "FOOD_PREFERENCE")
    private Integer foodPreference;

    @Column(name = "INVENTORY_ID")
    private Integer inventoryId;

    @Column(name = "QR_LINK")
    private String qrLink;

    @Column(name = "COURSE_ID")
    private Integer courseId;

    @Column(name = "INSTITUTION_ID")
    private Integer institutionId;

    @Column(name = "COUNTRY_ID")
    private Integer countryId = 100;

    @Column(name = "LOCAL_GUARDIAN_RELATION_TO_STUDENT")
    private String localGuardianRelationToStudent;

    @Column(name = "METADATA")
    private String METADATA;

    
}