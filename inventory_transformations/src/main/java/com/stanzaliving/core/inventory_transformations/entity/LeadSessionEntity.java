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
	@JsonProperty("lead_session_id")
    private Integer leadSessionId;

    @Column(name = "SESSION_ID")
	@JsonProperty("session_id")
    private String sessionId;

    @Column(name = "LEAD_ID")
	@JsonProperty("lead_id")
    private Integer leadId;

    @Column(name = "UTM_SOURCE")
	@JsonProperty("utm_source")
    private String utmSource;

    @Column(name = "UTM_MEDIUM")
	@JsonProperty("utm_medium")
    private String utmMedium;

    @Column(name = "UTM_CAMPAIGN")
	@JsonProperty("utm_campaign")
    private String utmCampaign;

    @Column(name = "UTM_TERM")
	@JsonProperty("utm_term")
    private String utmTerm;

    @Column(name = "UTM_ADGROUP")
	@JsonProperty("utm_adgroup")
    private String utmAdgroup;

    @Column(name = "GCLID")
	@JsonProperty("gclid")
    private String GCLID;

    @Column(name = "UTM_CONTENT")
	@JsonProperty("utm_content")
    private String utmContent;

    @Column(name = "UTM_TARGET")
	@JsonProperty("utm_target")
    private String utmTarget;

    @Column(name = "UTM_ADFORMAT")
	@JsonProperty("utm_adformat")
    private String utmAdformat;

    @Column(name = "SOURCE")
	@JsonProperty("source")
    private String SOURCE;

    @Column(name = "CREATED_AT", nullable = false)
	@JsonProperty("created_at")
    private Timestamp createdAt;

    @Column(name = "UPDATED_AT", nullable = false)
	@JsonProperty("updated_at")
    private Timestamp updatedAt;

    
}