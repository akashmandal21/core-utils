package com.stanzaliving.core.inventory_transformations.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@Data
@Table(name = "LEAD_SESSION")
@Entity
public class LeadSession implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "LEAD_SESSION_ID", insertable = false, nullable = false)
    private Integer leadSessionId;

    @Column(name = "SESSION_ID")
    private String sessionId;

    @Column(name = "LEAD_ID")
    private Integer leadId;

    @Column(name = "UTM_SOURCE")
    private String utmSource;

    @Column(name = "UTM_MEDIUM")
    private String utmMedium;

    @Column(name = "UTM_CAMPAIGN")
    private String utmCampaign;

    @Column(name = "UTM_TERM")
    private String utmTerm;

    @Column(name = "UTM_ADGROUP")
    private String utmAdgroup;

    @Column(name = "GCLID")
    private String GCLID;

    @Column(name = "UTM_CONTENT")
    private String utmContent;

    @Column(name = "UTM_TARGET")
    private String utmTarget;

    @Column(name = "UTM_ADFORMAT")
    private String utmAdformat;

    @Column(name = "SOURCE")
    private String SOURCE;

    @Column(name = "CREATED_AT", nullable = false)
    private LocalDateTime createdAt;

    @Column(name = "UPDATED_AT", nullable = false)
    private LocalDateTime updatedAt;

    
}