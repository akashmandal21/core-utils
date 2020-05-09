package com.stanzaliving.core.inventory_transformations.entity;

import com.fasterxml.jackson.annotation.JsonProperty;


import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;

@Entity
@Data
@Table(name = "LEAD")
public class LEADEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "LEAD_ID", insertable = false, nullable = false)
	@JsonProperty("LEAD_ID")
    private Integer leadId;

    @Column(name = "CREATED", nullable = false)
	@JsonProperty("CREATED")
    private Timestamp CREATED;

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

    @Column(name = "PHONE", nullable = false)
	@JsonProperty("PHONE")
    private Long PHONE;

    @Column(name = "PHONE_VERIFIED", nullable = false)
	@JsonProperty("PHONE_VERIFIED")
    private Boolean phoneVerified;

    @Column(name = "QUALIFICATION")
	@JsonProperty("QUALIFICATION")
    private String QUALIFICATION;

    @Column(name = "REFERRAL_CATEGORY")
	@JsonProperty("REFERRAL_CATEGORY")
    private String referralCategory;

    @Column(name = "REFERRAL_ID")
	@JsonProperty("REFERRAL_ID")
    private String referralId;

    @Column(name = "SOURCE")
	@JsonProperty("SOURCE")
    private String SOURCE;

    @Column(name = "STANZA_POC_EMAIL")
	@JsonProperty("STANZA_POC_EMAIL")
    private String stanzaPocEmail;

    @Column(name = "STATUS")
	@JsonProperty("STATUS")
    private String STATUS;

    @Column(name = "TYPE")
	@JsonProperty("TYPE")
    private String TYPE;

    @Column(name = "UPDATED", nullable = false)
	@JsonProperty("UPDATED")
    private Timestamp UPDATED;

    @Column(name = "ZOHO_STATUS")
	@JsonProperty("ZOHO_STATUS")
    private String zohoStatus;

    @Column(name = "CITY_ID")
	@JsonProperty("CITY_ID")
    private Integer cityId;

    @Column(name = "LEAD_OWNER_ID")
	@JsonProperty("LEAD_OWNER_ID")
    private Integer leadOwnerId;

    @Column(name = "MICROMARKET_ID")
	@JsonProperty("MICROMARKET_ID")
    private Integer micromarketId;

    @Column(name = "GCLID")
	@JsonProperty("GCLID")
    private String GCLID;

    @Column(name = "LEAD_TYPE")
	@JsonProperty("LEAD_TYPE")
    private String leadType;

    @Column(name = "UTM_ADFORMAT")
	@JsonProperty("UTM_ADFORMAT")
    private String utmAdformat;

    @Column(name = "UTM_ADGROUP")
	@JsonProperty("UTM_ADGROUP")
    private String utmAdgroup;

    @Column(name = "UTM_CAMPAIGN")
	@JsonProperty("UTM_CAMPAIGN")
    private String utmCampaign;

    @Column(name = "UTM_CONTENT")
	@JsonProperty("UTM_CONTENT")
    private String utmContent;

    @Column(name = "UTM_MEDIUM")
	@JsonProperty("UTM_MEDIUM")
    private String utmMedium;

    @Column(name = "UTM_SOURCE")
	@JsonProperty("UTM_SOURCE")
    private String utmSource;

    @Column(name = "UTM_TARGET")
	@JsonProperty("UTM_TARGET")
    private String utmTarget;

    @Column(name = "UTM_TERM")
	@JsonProperty("UTM_TERM")
    private String utmTerm;

    @Column(name = "RESIDENCE_ID")
	@JsonProperty("RESIDENCE_ID")
    private Integer residenceId;

    @Column(name = "COLLEGE")
	@JsonProperty("COLLEGE")
    private String COLLEGE;

    @Column(name = "OCCUPANCY")
	@JsonProperty("OCCUPANCY")
    private String OCCUPANCY;

    @Column(name = "VISIT_DATE")
	@JsonProperty("VISIT_DATE")
    private Timestamp visitDate;

    @Column(name = "COMMISION_EARNED")
	@JsonProperty("COMMISION_EARNED")
    private Integer commisionEarned = 0;

    @Column(name = "ZOHO_ID")
	@JsonProperty("ZOHO_ID")
    private String zohoId;

    @Column(name = "LEAD_MODE_ID")
	@JsonProperty("LEAD_MODE_ID")
    private Integer leadModeId;

    @Column(name = "LAST_RESIDENCE_VISITED")
	@JsonProperty("LAST_RESIDENCE_VISITED")
    private String lastResidenceVisited;

    @Column(name = "BOOKED_DATE")
	@JsonProperty("BOOKED_DATE")
    private Timestamp bookedDate;

    @Column(name = "LEAD_OWNER_ZOHO_ID")
	@JsonProperty("LEAD_OWNER_ZOHO_ID")
    private String leadOwnerZohoId;

    
}