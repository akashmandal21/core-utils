package com.stanzaliving.core.inventory_transformations.entity;

import com.fasterxml.jackson.annotation.JsonProperty;


import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;

@Entity
@Data
@Table(name = "LEAD")
public class LeadEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "LEAD_ID", insertable = false, nullable = false)
	@JsonProperty("lead_id")
    private Integer leadId;

    @Column(name = "CREATED", nullable = false)
	@JsonProperty("created")
    private Timestamp CREATED;

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

    @Column(name = "PHONE", nullable = false)
	@JsonProperty("phone")
    private Long PHONE;

    @Column(name = "PHONE_VERIFIED", nullable = false)
	@JsonProperty("phone_verified")
    private Boolean phoneVerified;

    @Column(name = "QUALIFICATION")
	@JsonProperty("qualification")
    private String QUALIFICATION;

    @Column(name = "REFERRAL_CATEGORY")
	@JsonProperty("referral_category")
    private String referralCategory;

    @Column(name = "REFERRAL_ID")
	@JsonProperty("referral_id")
    private String referralId;

    @Column(name = "SOURCE")
	@JsonProperty("source")
    private String SOURCE;

    @Column(name = "STANZA_POC_EMAIL")
	@JsonProperty("stanza_poc_email")
    private String stanzaPocEmail;

    @Column(name = "STATUS")
	@JsonProperty("status")
    private String STATUS;

    @Column(name = "TYPE")
	@JsonProperty("type")
    private String TYPE;

    @Column(name = "UPDATED", nullable = false)
	@JsonProperty("updated")
    private Timestamp UPDATED;

    @Column(name = "ZOHO_STATUS")
	@JsonProperty("zoho_status")
    private String zohoStatus;

    @Column(name = "CITY_ID")
	@JsonProperty("city_id")
    private Integer cityId;

    @Column(name = "LEAD_OWNER_ID")
	@JsonProperty("lead_owner_id")
    private Integer leadOwnerId;

    @Column(name = "MICROMARKET_ID")
	@JsonProperty("micromarket_id")
    private Integer micromarketId;

    @Column(name = "GCLID")
	@JsonProperty("gclid")
    private String GCLID;

    @Column(name = "LEAD_TYPE")
	@JsonProperty("lead_type")
    private String leadType;

    @Column(name = "UTM_ADFORMAT")
	@JsonProperty("utm_adformat")
    private String utmAdformat;

    @Column(name = "UTM_ADGROUP")
	@JsonProperty("utm_adgroup")
    private String utmAdgroup;

    @Column(name = "UTM_CAMPAIGN")
	@JsonProperty("utm_campaign")
    private String utmCampaign;

    @Column(name = "UTM_CONTENT")
	@JsonProperty("utm_content")
    private String utmContent;

    @Column(name = "UTM_MEDIUM")
	@JsonProperty("utm_medium")
    private String utmMedium;

    @Column(name = "UTM_SOURCE")
	@JsonProperty("utm_source")
    private String utmSource;

    @Column(name = "UTM_TARGET")
	@JsonProperty("utm_target")
    private String utmTarget;

    @Column(name = "UTM_TERM")
	@JsonProperty("utm_term")
    private String utmTerm;

    @Column(name = "RESIDENCE_ID")
	@JsonProperty("residence_id")
    private Integer residenceId;

    @Column(name = "COLLEGE")
	@JsonProperty("college")
    private String COLLEGE;

    @Column(name = "OCCUPANCY")
	@JsonProperty("occupancy")
    private String OCCUPANCY;

    @Column(name = "VISIT_DATE")
	@JsonProperty("visit_date")
    private Timestamp visitDate;

    @Column(name = "COMMISION_EARNED")
	@JsonProperty("commision_earned")
    private Integer commisionEarned = 0;

    @Column(name = "ZOHO_ID")
	@JsonProperty("zoho_id")
    private String zohoId;

    @Column(name = "LEAD_MODE_ID")
	@JsonProperty("lead_mode_id")
    private Integer leadModeId;

    @Column(name = "LAST_RESIDENCE_VISITED")
	@JsonProperty("last_residence_visited")
    private String lastResidenceVisited;

    @Column(name = "BOOKED_DATE")
	@JsonProperty("booked_date")
    private Timestamp bookedDate;

    @Column(name = "LEAD_OWNER_ZOHO_ID")
	@JsonProperty("lead_owner_zoho_id")
    private String leadOwnerZohoId;

    
}