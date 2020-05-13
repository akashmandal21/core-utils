package com.stanzaliving.core.inventory_transformations.entity;

import com.fasterxml.jackson.annotation.JsonProperty;


import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;

@Table(name = "LEAD_SESSION")
@Data
@Entity
public class LeadSessionEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "LEAD_SESSION_ID", insertable = false, nullable = false)
	@JsonProperty("LEAD_SESSION_ID")
    private Integer leadSessionId;

    @Column(name = "SESSION_ID")
	@JsonProperty("SESSION_ID")
    private String sessionId;

    @Column(name = "LEAD_ID")
	@JsonProperty("LEAD_ID")
    private Integer leadId;

    @Column(name = "UTM_SOURCE")
	@JsonProperty("UTM_SOURCE")
    private String utmSource;

    @Column(name = "UTM_MEDIUM")
	@JsonProperty("UTM_MEDIUM")
    private String utmMedium;

    @Column(name = "UTM_CAMPAIGN")
	@JsonProperty("UTM_CAMPAIGN")
    private String utmCampaign;

    @Column(name = "UTM_TERM")
	@JsonProperty("UTM_TERM")
    private String utmTerm;

    @Column(name = "UTM_ADGROUP")
	@JsonProperty("UTM_ADGROUP")
    private String utmAdgroup;

    @Column(name = "GCLID")
	@JsonProperty("GCLID")
    private String GCLID;

    @Column(name = "UTM_CONTENT")
	@JsonProperty("UTM_CONTENT")
    private String utmContent;

    @Column(name = "UTM_TARGET")
	@JsonProperty("UTM_TARGET")
    private String utmTarget;

    @Column(name = "UTM_ADFORMAT")
	@JsonProperty("UTM_ADFORMAT")
    private String utmAdformat;

    @Column(name = "SOURCE")
	@JsonProperty("SOURCE")
    private String SOURCE;

    @Column(name = "CREATED_AT", nullable = false)
	@JsonProperty("CREATED_AT")
    private Timestamp createdAt;

    @Column(name = "UPDATED_AT", nullable = false)
	@JsonProperty("UPDATED_AT")
    private Timestamp updatedAt;

    
}