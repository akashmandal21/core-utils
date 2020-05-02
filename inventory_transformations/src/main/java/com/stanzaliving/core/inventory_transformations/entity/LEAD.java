package com.stanzaliving.core.inventory_transformations.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Table(name = "LEAD")
@Data
public class LEAD implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "LEAD_ID", insertable = false, nullable = false)
    private Integer leadId;

    @Column(name = "CREATED", nullable = false)
    private LocalDateTime CREATED;

    @Column(name = "EMAIL")
    private String EMAIL;

    @Column(name = "FIRST_NAME")
    private String firstName;

    @Column(name = "GENDER")
    private Integer GENDER;

    @Column(name = "LAST_NAME")
    private String lastName;

    @Column(name = "PHONE", nullable = false)
    private Long PHONE;

    @Column(name = "PHONE_VERIFIED", nullable = false)
    private Boolean phoneVerified;

    @Column(name = "QUALIFICATION")
    private String QUALIFICATION;

    @Column(name = "REFERRAL_CATEGORY")
    private String referralCategory;

    @Column(name = "REFERRAL_ID")
    private String referralId;

    @Column(name = "SOURCE")
    private String SOURCE;

    @Column(name = "STANZA_POC_EMAIL")
    private String stanzaPocEmail;

    @Column(name = "STATUS")
    private String STATUS;

    @Column(name = "TYPE")
    private String TYPE;

    @Column(name = "UPDATED", nullable = false)
    private LocalDateTime UPDATED;

    @Column(name = "ZOHO_STATUS")
    private String zohoStatus;

    @Column(name = "CITY_ID")
    private Integer cityId;

    @Column(name = "LEAD_OWNER_ID")
    private Integer leadOwnerId;

    @Column(name = "MICROMARKET_ID")
    private Integer micromarketId;

    @Column(name = "GCLID")
    private String GCLID;

    @Column(name = "LEAD_TYPE")
    private String leadType;

    @Column(name = "UTM_ADFORMAT")
    private String utmAdformat;

    @Column(name = "UTM_ADGROUP")
    private String utmAdgroup;

    @Column(name = "UTM_CAMPAIGN")
    private String utmCampaign;

    @Column(name = "UTM_CONTENT")
    private String utmContent;

    @Column(name = "UTM_MEDIUM")
    private String utmMedium;

    @Column(name = "UTM_SOURCE")
    private String utmSource;

    @Column(name = "UTM_TARGET")
    private String utmTarget;

    @Column(name = "UTM_TERM")
    private String utmTerm;

    @Column(name = "RESIDENCE_ID")
    private Integer residenceId;

    @Column(name = "COLLEGE")
    private String COLLEGE;

    @Column(name = "OCCUPANCY")
    private String OCCUPANCY;

    @Column(name = "VISIT_DATE")
    private LocalDateTime visitDate;

    @Column(name = "COMMISION_EARNED")
    private Integer commisionEarned = 0;

    @Column(name = "ZOHO_ID")
    private String zohoId;

    @Column(name = "LEAD_MODE_ID")
    private Integer leadModeId;

    @Column(name = "LAST_RESIDENCE_VISITED")
    private String lastResidenceVisited;

    @Column(name = "BOOKED_DATE")
    private LocalDateTime bookedDate;

    @Column(name = "LEAD_OWNER_ZOHO_ID")
    private String leadOwnerZohoId;

    
}